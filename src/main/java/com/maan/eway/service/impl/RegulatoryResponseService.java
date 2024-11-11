package com.maan.eway.service.impl;


import java.io.BufferedWriter;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;
import java.util.function.Consumer;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.maan.eway.bean.HomePositionMaster;
import com.maan.eway.bean.SectionDataDetails;
import com.maan.eway.bean.TiraTrackingDetails;
import com.maan.eway.config.DigitalSignatureGenerator;
import com.maan.eway.repository.HomePositionMasterRepository;
import com.maan.eway.repository.SectionDataDetailsRepository;
import com.maan.eway.repository.TiraTrackingDetailsRepository;
import com.maan.eway.req.acknowledge.FleetResDtl;
import com.maan.eway.req.acknowledge.MotorCoverNoteRefResAck;
import com.maan.eway.req.acknowledge.TiraM;
import com.maan.eway.req.acknowledge.TiraMsgAcknowlege;
import com.maan.eway.req.acknowledge.TiraMsgAcknowlegeFleet;
import com.maan.eway.req.fleet.TiraMsgVehiclePushFleet;
import com.maan.eway.req.push.PolicyHolder;
import com.maan.eway.req.push.TiraMsgCoverPush;
import com.maan.eway.req.push.TiraMsgVehiclePush;
import com.maan.eway.res.MotorTiraMsgRes;
import com.maan.eway.res.NonMotorTiraMsgRes;


@Service
public class RegulatoryResponseService {

	private Logger log = LogManager.getLogger(RegulatoryResponseService.class);
	
	@Value("${file.primaryPath}")
	private String primaryPath ;
	
	@Autowired
	private TiraTrackingDetailsRepository tiraTrackRepo;
	
	@Autowired
	private HomePositionMasterRepository homePositionRepo;

	@Autowired	
	private DigitalSignatureGenerator signature;
	
	@Autowired
	private SectionDataDetailsRepository sectionDataRepo;

	@Value("${mail.pushnotification}")
	private String mailLink;
	
	//@Async("RegulatoryRequestsExecutor")
	public Map<String,String> saveRequestAndResponse(String request,String response,String basePath) {
		Map<String,String> result=new HashMap<String, String>();
		try {
			SimpleDateFormat format=new SimpleDateFormat("YYYY-MM-dd'T'HH-mm-ss.SSS");			
			String seconds = format.format(new Date());
			
			
			Path directory =Paths.get(primaryPath);
			if(Files.exists(directory)) {
				BufferedWriter writer =null;
				try {
					Path fileDirectory = Paths.get(primaryPath.concat(basePath));
					if(!Files.exists(fileDirectory)) {
						Files.createDirectories(fileDirectory);
 					}
					String path = primaryPath.concat(basePath).concat("/REQ "+seconds+".txt");
					result.put("REQ_PATH", path);
					Path fileD= Paths.get(path);
					writer = Files.newBufferedWriter(fileD, Charset.forName("UTF-8"));
					writer.write(request);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					if(writer!=null)
						writer.close();
				}
				
				try {					
					//Respnse  
					Path fileDirectory = Paths.get(primaryPath.concat(basePath));
					if(!Files.exists(fileDirectory)) {
						Files.createDirectories(fileDirectory);
 					}
					String path = primaryPath.concat(basePath).concat("/RES "+seconds+".txt");
					result.put("RES_PATH", path);
					Path fileD= Paths.get(path);
					writer = Files.newBufferedWriter(fileD, Charset.forName("UTF-8"));
					writer.write(response);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					if(writer!=null)
						writer.close();
				}
				

			}else {
				log.info(primaryPath+" Not Exist");
			}
		}catch (Exception e) {
			e.printStackTrace();
			log.error(e);
		}finally {
			
		}
		return result;
	}
	
	

	@Async("RegulatoryResponseUpdate")
	public void savePostResponseInTables(TiraMsgVehiclePush req, MotorTiraMsgRes res,String methodName,String xmlString, String tokens) {
		Map<String, String> paths=null;
		
		Map<String ,Object> request=new HashMap<String, Object>();
		Map<String ,Object> customer=new HashMap<String, Object>();
		List<String> attachment=new ArrayList<String>();
		try{
			 String registrationNo=req.getMotorCoverNoteRefReq().getCoverNoteDtlBean().getMotorDtlBean().getRegistrationNumber(); // ().getVerificationDtl().getMotorRegistrationNumber();
			 String chassisNo=req.getMotorCoverNoteRefReq().getCoverNoteDtlBean().getMotorDtlBean().getChassisNumber();
			  StringWriter sw = new StringWriter();
			 	try {
			    JAXBContext newInstancev1 = JAXBContext.newInstance(MotorTiraMsgRes.class);
				Marshaller createMarshallerv1 = newInstancev1.createMarshaller();
				createMarshallerv1.setProperty("com.sun.xml.bind.xmlDeclaration", false);
				
				createMarshallerv1.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
				createMarshallerv1.marshal(res, sw);
			 	}catch (Exception e) {
			 		e.printStackTrace();
				}
				
			//paths =
			paths=saveRequestAndResponse(xmlString, res==null?"RESPONSE ERROR":sw.toString(), "PushPolicy/"+(StringUtils.isNotBlank(chassisNo)?chassisNo:registrationNo));
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		try {
				String reqPath="Not Found";
				String resPath="Not Found";
				if(paths!=null && !paths.isEmpty()) {
					reqPath=paths.get("REQ_PATH");
					resPath=paths.get("RES_PATH");
				}
			Boolean status=("TIRA001".equals(res.getMotorcoverNote().getAcknowledgementStatusCode())
							||
							("TIRA214".equals(res.getMotorcoverNote().getAcknowledgementStatusCode()) 
									&& "Transaction successfully cancelled".equalsIgnoreCase(res.getMotorcoverNote().getAcknowledgementStatusDesc()
									)))?true:false;	
			String quoteNoWithRisk=req.getMotorCoverNoteRefReq().getCoverNoteDtlBean().getCoverNoteNumber();
			String vehicleId = quoteNoWithRisk.substring(quoteNoWithRisk.lastIndexOf("-")+1,quoteNoWithRisk.length());
			String quoteNo=req.getMotorCoverNoteRefReq().getCoverNoteDtlBean().getCoverNoteNumber().replaceAll("-"+vehicleId, "");
			TiraTrackingDetails tira=TiraTrackingDetails.builder()
					.requestId(req.getMotorCoverNoteRefReq().getCoverNoteHdrBean().getRequestId())
					.acknowledgementId(res.getMotorcoverNote().getAcknowledgementId())
					.entryDate(new Date())
					.hitCount(0)
					.methodName(methodName)
					.policyNo(quoteNo)
					.status(status?"Y":"N")
					.statusCode(res.getMotorcoverNote().getAcknowledgementStatusCode())
					.statusDesc(res.getMotorcoverNote().getAcknowledgementStatusDesc())
					.chassisNo(req.getMotorCoverNoteRefReq().getCoverNoteDtlBean().getMotorDtlBean().getChassisNumber())
					.tiraTrackingId(Long.valueOf(Instant.now().toEpochMilli()))
					.requestFilePath(reqPath)
					.responseFilePath(resPath)
					.vehicleId(StringUtils.isBlank(vehicleId)?1:Integer.parseInt(vehicleId))
					.build();
			tiraTrackRepo.save(tira);
			
			attachment.add(reqPath);
			attachment.add(resPath);
			
			if(status) {
				//CoverNoteNumber
				HomePositionMaster hm = homePositionRepo.findByQuoteNo(req.getMotorCoverNoteRefReq().getCoverNoteDtlBean().getCoverNoteNumber());
				hm.setTiraRequestId(req.getMotorCoverNoteRefReq().getCoverNoteHdrBean().getRequestId());
				homePositionRepo.save(hm);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			
			
			
			PolicyHolder policyHolder = req.getMotorCoverNoteRefReq().getCoverNoteDtlBean().getPolicyHoldersBean().getPolicyHolderBeanList().get(0);
			request.put("Attachments", attachment);
			request.put("BranchCode", "01");
			customer.put("Customermailid", "maanrsa001@gmail.com");
			customer.put("Customername", policyHolder.getPolicyHolderName());
			customer.put("Customermessengercode", "0");
			customer.put("Customermessengerphone", policyHolder.getPolicyHolderPhoneNumber());
			customer.put("Customerphonecode","0");
			customer.put("Customerphoneno", policyHolder.getPolicyHolderPhoneNumber());			
			request.put("Notifcationdate", new Date());
			request.put("Notifdescription", res.getMotorcoverNote().getAcknowledgementStatusCode() +"-"+ res.getMotorcoverNote().getAcknowledgementStatusDesc());
			request.put("Notifpriority", 0);
			request.put("Notifpushedstatus", "PENDING");
			request.put("Notiftemplatename", "TIRA_ACK_ERR");
			request.put("Policyno", req.getMotorCoverNoteRefReq().getCoverNoteDtlBean().getCoverNoteNumber());
			request.put("ProductId", 5);
			request.put("Productname", "Motor");
			request.put("Quoteno", req.getMotorCoverNoteRefReq().getCoverNoteDtlBean().getCoverNoteNumber());
			request.put("RequestReferenceNo", req.getMotorCoverNoteRefReq().getCoverNoteDtlBean().getCoverNoteNumber());
			request.put("Statusmessage", res.getMotorcoverNote().getAcknowledgementStatusDesc());			
			request.put("Customer", customer); 
			request.put("CompanyId", "100002");
			
			pushNotification(request,tokens);
		}
	}
	
	@Async
	private void pushNotification(Map<String, Object> request,String tokens) {
		try {
			System.out.println("MAIL::Request::: "+ request);
			try {
				if(!request.isEmpty()) {
					RestTemplate restTemplate = new RestTemplate();
					HttpHeaders headers = new HttpHeaders();
					headers.setAccept(Arrays.asList(new MediaType[] { MediaType.APPLICATION_JSON }));
					headers.setContentType(MediaType.APPLICATION_JSON);
					headers.set("Authorization", tokens);
					HttpEntity<Object> entityReq = new HttpEntity<>(request, headers);
					System.out.println(entityReq.getBody());
					ResponseEntity<Object> response = restTemplate.postForEntity(mailLink, entityReq, Object.class);
					System.out.println(response.getBody());
				}else {
					System.out.println("MAIL CANT sent no content ");
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	

	public TiraMsgAcknowlege updateAcknowlegment(TiraMsgAcknowlege req,String tokens) {
		List<TiraTrackingDetails> previousOnes=tiraTrackRepo.findByRequestIdAndStatusAndMethodNameOrderByEntryDateDesc(req.getMotorCoverNoteRefRes().getRequestId(),"Y","/covernote/non-life/motor/v2/request");
		TiraTrackingDetails previousOne=previousOnes.get(0);
		String acknowledge=previousOne.getAcknowledgementId();
		String policyNo=previousOne.getPolicyNo();
		String chassisNo=previousOne.getChassisNo();
		TiraMsgAcknowlege ackResponse=null;
		Map<String, String> paths=null;
		Map<String ,Object> requests=new HashMap<String, Object>();
		Map<String ,Object> customer=new HashMap<String, Object>();
		List<String> attachment=new ArrayList<String>();
		
		try{
			 
			  StringWriter sw = new StringWriter();
			 	try {
			    JAXBContext newInstancev1 = JAXBContext.newInstance(TiraMsgAcknowlege.class);
				Marshaller createMarshallerv1 = newInstancev1.createMarshaller();
				createMarshallerv1.setProperty("com.sun.xml.bind.xmlDeclaration", false);
				
				createMarshallerv1.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
				createMarshallerv1.marshal(req, sw);
				String request = sw.toString();
				
				ackResponse=new TiraMsgAcknowlege();
				MotorCoverNoteRefResAck resAck=new MotorCoverNoteRefResAck();
				resAck.setAcknowledgementId(acknowledge);
				resAck.setResponseId(req.getMotorCoverNoteRefRes().getResponseId());
				resAck.setAcknowledgementStatusCode(previousOne.getStatusCode());
				resAck.setAcknowledgementStatusDesc(previousOne.getStatusDesc());
				ackResponse.setMotorCoverNoteRefResAck(resAck);
				
				sw=new StringWriter();
				createMarshallerv1.marshal(resAck, sw);
				String response = sw.toString();
				response=response.replaceAll(">[\\s\r\n]*<", "><");//("[\r\n]+", "");				
				String collectMsgSignature = signature.collectMsgSignature(response);
				ackResponse.setMsgSignature(collectMsgSignature);
				
				paths=saveRequestAndResponse(request, response==null?"RESPONSE ERROR":response, "PushPolicy/"+chassisNo);
				 
			 	}catch (Exception e) {
			 		e.printStackTrace();
				}
				
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		Boolean status=false;
		
		
		try {
			String reqPath="Not Found";
			String resPath="Not Found";
			if(paths!=null && !paths.isEmpty()) {
				reqPath=paths.get("REQ_PATH");
				resPath=paths.get("RES_PATH");
			}
			
			status=("TIRA001".equals(req.getMotorCoverNoteRefRes().getResponseStatusCode())
					||
					("TIRA214".equals(req.getMotorCoverNoteRefRes().getResponseStatusCode()) 
							&& "Transaction successfully cancelled".equalsIgnoreCase(req.getMotorCoverNoteRefRes().getResponseStatusDesc()
									)))?true:false;	
			
			TiraTrackingDetails tira=TiraTrackingDetails.builder()
					.requestId(req.getMotorCoverNoteRefRes().getRequestId())
					.acknowledgementId(acknowledge)
					.responseId(req.getMotorCoverNoteRefRes().getResponseId())
					.entryDate(new Date())
					.hitCount(0)
					.methodName("/covernote/non-life/motor/v2/acknowledge")
					.policyNo(policyNo)
					.status(status?"Y":"N")
					.statusCode(req.getMotorCoverNoteRefRes().getResponseStatusCode())
					.statusDesc(req.getMotorCoverNoteRefRes().getResponseStatusDesc())
					.chassisNo(chassisNo)
					.tiraTrackingId(Long.valueOf(Instant.now().toEpochMilli()))
					.requestFilePath(reqPath)
					.responseFilePath(resPath)
					.vehicleId(previousOne.getVehicleId())
					.build();
			tiraTrackRepo.save(tira);
			attachment.add(reqPath);
			attachment.add(resPath);
		}catch (Exception e) {
			e.printStackTrace();
		}
		try {
			HomePositionMaster hm =null;
			if(previousOne!=null && StringUtils.isNotBlank(previousOne.getPolicyNo())) {
				try {
					List<SectionDataDetails> sections=sectionDataRepo.findByQuoteNo(previousOne.getPolicyNo());
					sections.stream().filter(s-> s.getRiskId().compareTo(previousOne.getVehicleId())==0).forEach(new Consumer<SectionDataDetails>() {

						@Override
						public void accept(SectionDataDetails t) {
							boolean  status=("TIRA001".equals(req.getMotorCoverNoteRefRes().getResponseStatusCode())
									||
									("TIRA214".equals(req.getMotorCoverNoteRefRes().getResponseStatusCode()) 
											&& "Transaction successfully cancelled".equalsIgnoreCase(req.getMotorCoverNoteRefRes().getResponseStatusDesc()
													)))?true:false;				
							if(!"TIRA001".equals(StringUtils.isBlank(t.getResponseStatusCode())?"":t.getResponseStatusCode())) {
								t.setTiraResponseId(req.getMotorCoverNoteRefRes().getResponseId());
								t.setResponseStatusCode(req.getMotorCoverNoteRefRes().getResponseStatusCode());
								t.setResponseStatusDesc(req.getMotorCoverNoteRefRes().getResponseStatusDesc());
							}
							if(status) {
								t.setCoverNoteReferenceNo(req.getMotorCoverNoteRefRes().getCoverNoteReferenceNumber());
								t.setStickerNumber(req.getMotorCoverNoteRefRes().getStickerNumber());
							}		
						}

					}); 
					sectionDataRepo.saveAll(sections);
				}catch (Exception e) {
					e.printStackTrace();
				}
				
				
				 hm = homePositionRepo.findByTiraRequestIdAndQuoteNo(req.getMotorCoverNoteRefRes().getRequestId(),previousOne.getPolicyNo());
				if(hm!=null) {
					
					
					hm.setTiraResponseId(req.getMotorCoverNoteRefRes().getResponseId());
					hm.setResponseStatusCode(req.getMotorCoverNoteRefRes().getResponseStatusCode());
					hm.setResponseStatusDesc(req.getMotorCoverNoteRefRes().getResponseStatusDesc());
					if(status) {
						hm.setCoverNoteReferenceNo(req.getMotorCoverNoteRefRes().getCoverNoteReferenceNumber());
						hm.setStickerNumber(req.getMotorCoverNoteRefRes().getStickerNumber());
					}					
					homePositionRepo.save(hm);   
					
				}
				
			}
			requests.put("Attachments", attachment);
			requests.put("BranchCode", "01");
			customer.put("Customermailid", "maanrsa001@gmail.com");
			customer.put("Customername", hm==null?"Customer":hm.getCustomerName());
			customer.put("Customermessengercode", "91111111");
			customer.put("Customermessengerphone", "0");
			customer.put("Customerphonecode","91111100");
			customer.put("Customerphoneno", "0");			
			requests.put("Notifcationdate", new Date());
			requests.put("Notifdescription", req.getMotorCoverNoteRefRes().getResponseStatusCode() +"-"+ req.getMotorCoverNoteRefRes().getResponseStatusDesc());
			requests.put("Notifpriority", 0);
			requests.put("Notifpushedstatus", "PENDING");
			requests.put("Notiftemplatename", "TIRA_ACK_ERR");
			requests.put("Policyno", previousOne.getPolicyNo());
			requests.put("ProductId", 5);
			requests.put("Productname", "Motor");
			requests.put("Quoteno",  previousOne.getPolicyNo());
			requests.put("RequestReferenceNo",  previousOne.getPolicyNo());
			requests.put("Statusmessage", req.getMotorCoverNoteRefRes().getResponseStatusDesc());			
			requests.put("Customer", customer); 
			requests.put("CompanyId", "100002");
			return ackResponse;
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			
			
			
			//PolicyHolder policyHolder = req.getMotorCoverNoteRefReq().getCoverNoteDtlBean().getPolicyHoldersBean().getPolicyHolderBeanList().get(0);
			
			
		 
			pushNotification(requests,tokens);
		}
		
		return null;
	}



	public void savePostResponseInTablesNonMotor(TiraMsgCoverPush req, NonMotorTiraMsgRes res, String methodName,
			String xmlString) {
		Map<String, String> paths=null;
		try{
			 String registrationNo="";//req.getCoverNoteRefReq().getCoverNoteDtlBean().getMotorDtlBean().getRegistrationNumber(); // ().getVerificationDtl().getMotorRegistrationNumber();
			 String chassisNo=req.getCoverNoteRefReq().getCoverNoteDtlBean().getCoverNoteNumber();//req.getCoverNoteRefReq().getCoverNoteDtlBean().getMotorDtlBean().getChassisNumber();
			  StringWriter sw = new StringWriter();
			 	try {
			    JAXBContext newInstancev1 = JAXBContext.newInstance(NonMotorTiraMsgRes.class);
				Marshaller createMarshallerv1 = newInstancev1.createMarshaller();
				createMarshallerv1.setProperty("com.sun.xml.bind.xmlDeclaration", false);
				
				createMarshallerv1.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
				createMarshallerv1.marshal(res, sw);
			 	}catch (Exception e) {
			 		e.printStackTrace();
				}
				
			 paths=saveRequestAndResponse(xmlString, res==null?"RESPONSE ERROR":sw.toString(), "PushPolicy/"+(StringUtils.isNotBlank(chassisNo)?chassisNo:registrationNo));
			 
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		try {
				String reqPath="Not Found";
				String resPath="Not Found";
				if(paths!=null && !paths.isEmpty()) {
					reqPath=paths.get("REQ_PATH");
					resPath=paths.get("RES_PATH");
				}
			Boolean status=("TIRA001".equals(res.getNonmotorcoverNote().getAcknowledgementStatusCode())
							||
							("TIRA214".equals(res.getNonmotorcoverNote().getAcknowledgementStatusCode()) 
									&& "Transaction successfully cancelled".equalsIgnoreCase(res.getNonmotorcoverNote().getAcknowledgementStatusDesc()
									)))?true:false;	
							
			TiraTrackingDetails tira=TiraTrackingDetails.builder()
					.requestId(req.getCoverNoteRefReq().getCoverNoteHdrBean().getRequestId())
					.acknowledgementId(res.getNonmotorcoverNote().getAcknowledgementId())
					.entryDate(new Date())
					.hitCount(0)
					.methodName(methodName)
					.policyNo(req.getCoverNoteRefReq().getCoverNoteDtlBean().getCoverNoteNumber())
					.status(status?"Y":"N")
					.statusCode(res.getNonmotorcoverNote().getAcknowledgementStatusCode())
					.statusDesc(res.getNonmotorcoverNote().getAcknowledgementStatusDesc())
					.chassisNo(req.getCoverNoteRefReq().getCoverNoteDtlBean().getCoverNoteNumber())
					.tiraTrackingId(Long.valueOf(Instant.now().toEpochMilli()))
					.requestFilePath(reqPath)
					.responseFilePath(resPath)
					.build();
			tiraTrackRepo.save(tira);
			
			if(status) {
				//CoverNoteNumber
				
				
				HomePositionMaster hm = homePositionRepo.findByQuoteNo(req.getCoverNoteRefReq().getCoverNoteDtlBean().getCoverNoteNumber());
				hm.setTiraRequestId(req.getCoverNoteRefReq().getCoverNoteHdrBean().getRequestId());
				homePositionRepo.save(hm);
			}
		}catch (Exception e) {
			e.printStackTrace();
		} 
	}



	public TiraMsgAcknowlege updateAcknowlegmentForNonMotor(TiraMsgAcknowlege req) {

		List<TiraTrackingDetails> previousOnes=tiraTrackRepo.findByRequestIdAndStatusAndMethodNameOrderByEntryDateDesc(req.getCoverNoteRefRes().getRequestId(),"Y","/covernote/non-life/other/v2/request");
		TiraTrackingDetails previousOne=previousOnes.get(0);
		String acknowledge=previousOne.getAcknowledgementId();
		String policyNo=previousOne.getPolicyNo();
		String chassisNo=previousOne.getChassisNo();
		TiraMsgAcknowlege ackResponse=null;
		Map<String, String> paths=null;
		try{
			 
			  StringWriter sw = new StringWriter();
			 	try {
			    JAXBContext newInstancev1 = JAXBContext.newInstance(TiraMsgAcknowlege.class);
				Marshaller createMarshallerv1 = newInstancev1.createMarshaller();
				createMarshallerv1.setProperty("com.sun.xml.bind.xmlDeclaration", false);
				
				createMarshallerv1.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
				createMarshallerv1.marshal(req, sw);
				String request = sw.toString();
				
				ackResponse=new TiraMsgAcknowlege();
				MotorCoverNoteRefResAck resAck=new MotorCoverNoteRefResAck();
				resAck.setAcknowledgementId(acknowledge);
				resAck.setResponseId(req.getCoverNoteRefRes().getResponseId());
				resAck.setAcknowledgementStatusCode(previousOne.getStatusCode());
				resAck.setAcknowledgementStatusDesc(previousOne.getStatusDesc());
				ackResponse.setMotorCoverNoteRefResAck(resAck);
				
				sw=new StringWriter();
				createMarshallerv1.marshal(resAck, sw);
				String response = sw.toString();
				response=response.replaceAll(">[\\s\r\n]*<", "><");//("[\r\n]+", "");				
				String collectMsgSignature = signature.collectMsgSignature(response);
				ackResponse.setMsgSignature(collectMsgSignature);
				
				 paths=saveRequestAndResponse(request, response==null?"RESPONSE ERROR":response, "PushPolicy/"+chassisNo);
				
			 	}catch (Exception e) {
			 		e.printStackTrace();
				}
				
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		Boolean status=false;
		
		
		try {
			String reqPath="Not Found";
			String resPath="Not Found";
			if(paths!=null && !paths.isEmpty()) {
				reqPath=paths.get("REQ_PATH");
				resPath=paths.get("RES_PATH");
			}
			
			status=("TIRA001".equals(req.getCoverNoteRefRes().getResponseStatusCode())
					||
					("TIRA214".equals(req.getCoverNoteRefRes().getResponseStatusCode()) 
							&& "Transaction successfully cancelled".equalsIgnoreCase(req.getCoverNoteRefRes().getResponseStatusDesc()
									)))?true:false;	
			
			TiraTrackingDetails tira=TiraTrackingDetails.builder()
					.requestId(req.getCoverNoteRefRes().getRequestId())
					.acknowledgementId(acknowledge)
					.responseId(req.getCoverNoteRefRes().getResponseId())
					.entryDate(new Date())
					.hitCount(0)
					.methodName("/covernote/non-life/other/v2/acknowledge")
					.policyNo(policyNo)
					.status(status?"Y":"N")
					.statusCode(req.getCoverNoteRefRes().getResponseStatusCode())
					.statusDesc(req.getCoverNoteRefRes().getResponseStatusDesc())
					.chassisNo(chassisNo)
					.tiraTrackingId(Long.valueOf(Instant.now().toEpochMilli()))
					.requestFilePath(reqPath)
					.responseFilePath(resPath)
					.build();
			tiraTrackRepo.save(tira);
		}catch (Exception e) {
			e.printStackTrace();
		}
		try {
			if(previousOne!=null && StringUtils.isNotBlank(previousOne.getPolicyNo())) {
				HomePositionMaster hm = homePositionRepo.findByTiraRequestIdAndQuoteNo(req.getCoverNoteRefRes().getRequestId(),previousOne.getPolicyNo());
				if(hm!=null) {
					
					
					hm.setTiraResponseId(req.getCoverNoteRefRes().getResponseId());
					hm.setResponseStatusCode(req.getCoverNoteRefRes().getResponseStatusCode());
					hm.setResponseStatusDesc(req.getCoverNoteRefRes().getResponseStatusDesc());
					if(status) {
						hm.setCoverNoteReferenceNo(req.getCoverNoteRefRes().getCoverNoteReferenceNumber());
						//hm.setStickerNumber(req.getCoverNoteRefRes().getStickerNumber());
					}					
					homePositionRepo.save(hm);
				}
			}
			return ackResponse;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	
	}



	public void savePostResponseInTables(TiraMsgVehiclePushFleet req, MotorTiraMsgRes res, String methodName,String xmlString) {

		Map<String, String> paths=null;
		try{
			 String registrationNo="";//req.getMotorCoverNoteRefReq().getCoverNoteDtlBean().getMotorDtlBean().getRegistrationNumber(); // ().getVerificationDtl().getMotorRegistrationNumber();
			 String chassisNo="";//req.getMotorCoverNoteRefReq().getCoverNoteDtlBean().getMotorDtlBean().getChassisNumber();
			  StringWriter sw = new StringWriter();
			 	try {
			    JAXBContext newInstancev1 = JAXBContext.newInstance(MotorTiraMsgRes.class);
				Marshaller createMarshallerv1 = newInstancev1.createMarshaller();
				createMarshallerv1.setProperty("com.sun.xml.bind.xmlDeclaration", false);
				
				createMarshallerv1.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
				createMarshallerv1.marshal(res, sw);
			 	}catch (Exception e) {
			 		e.printStackTrace();
				}
				
			paths=saveRequestAndResponse(xmlString, res==null?"RESPONSE ERROR":sw.toString(), "PushPolicy/"+(StringUtils.isNotBlank(chassisNo)?chassisNo:registrationNo));

		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		try {
				String reqPath="Not Found";
				String resPath="Not Found";
				if(paths!=null && !paths.isEmpty()) {
					reqPath=paths.get("REQ_PATH");
					resPath=paths.get("RES_PATH");
				}
			Boolean status=("TIRA001".equals(res.getMotorcoverNote().getAcknowledgementStatusCode())
							||
							("TIRA214".equals(res.getMotorcoverNote().getAcknowledgementStatusCode()) 
									&& "Transaction successfully cancelled".equalsIgnoreCase(res.getMotorcoverNote().getAcknowledgementStatusDesc()
									)))?true:false;	
							
			TiraTrackingDetails tira=TiraTrackingDetails.builder()
					.requestId(req.getMotorCoverNoteRefReq().getCoverNoteHdrBean().getRequestId())
					.acknowledgementId(res.getMotorcoverNote().getAcknowledgementId())
					.entryDate(new Date())
					.hitCount(0)
					.methodName(methodName)
					.policyNo(req.getMotorCoverNoteRefReq().getCoverNoteDtlBean().getFleetHdr().getFleetId())
					.status(status?"Y":"N")
					.statusCode(res.getMotorcoverNote().getAcknowledgementStatusCode())
					.statusDesc(res.getMotorcoverNote().getAcknowledgementStatusDesc())
					.chassisNo(req.getMotorCoverNoteRefReq().getCoverNoteDtlBean().getFleetHdr().getFleetId())
					.tiraTrackingId(Long.valueOf(Instant.now().toEpochMilli()))
					.requestFilePath(reqPath)
					.responseFilePath(resPath)
					.build();
			tiraTrackRepo.save(tira);
			
			if(status) {
				//CoverNoteNumber
				HomePositionMaster hm = homePositionRepo.findByQuoteNo(req.getMotorCoverNoteRefReq().getCoverNoteDtlBean().getFleetHdr().getFleetId());
				hm.setTiraRequestId(req.getMotorCoverNoteRefReq().getCoverNoteHdrBean().getRequestId());
				homePositionRepo.save(hm);
			}
		}catch (Exception e) {
			e.printStackTrace();
		} 
	
		
	}



	public TiraM updateAcknowlegmentFleet(TiraMsgAcknowlegeFleet req) {
		List<TiraTrackingDetails> previousOnes=tiraTrackRepo.findByRequestIdAndStatusAndMethodNameOrderByEntryDateDesc(req.getMotorCoverNoteRefRes().getFleetResHdr().getRequestId(),"Y","/covernote/non-life/motor/v2/requestfleet");
		TiraTrackingDetails previousOne=previousOnes.get(0);
		String acknowledge=previousOne.getAcknowledgementId();
		String policyNo=previousOne.getPolicyNo();
		String chassisNo="";//previousOne.getChassisNo();
		TiraM ackResponse=null;
		Map<String, String> paths=null;
		try{
			 
			  StringWriter sw = new StringWriter();
			 	try {
			    JAXBContext newInstancev1 = JAXBContext.newInstance(TiraMsgAcknowlegeFleet.class);
				Marshaller createMarshallerv1 = newInstancev1.createMarshaller();
				createMarshallerv1.setProperty("com.sun.xml.bind.xmlDeclaration", false);
				
				createMarshallerv1.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
				createMarshallerv1.marshal(req, sw);
				String request = sw.toString();
				
				ackResponse=new TiraM();
				MotorCoverNoteRefResAck resAck=new MotorCoverNoteRefResAck();
				resAck.setAcknowledgementId(acknowledge);
				resAck.setResponseId(req.getMotorCoverNoteRefRes().getFleetResHdr().getResponseId());
				resAck.setAcknowledgementStatusCode(previousOne.getStatusCode());
				resAck.setAcknowledgementStatusDesc(previousOne.getStatusDesc());
				ackResponse.setMotorCoverNoteRefResAck(resAck);
				
				sw=new StringWriter();
				  newInstancev1 = JAXBContext.newInstance(TiraM.class);
				  createMarshallerv1 = newInstancev1.createMarshaller();
				  createMarshallerv1.setProperty("com.sun.xml.bind.xmlDeclaration", false);
				createMarshallerv1.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
				createMarshallerv1.marshal(resAck, sw);
				String response = sw.toString();
				response=response.replaceAll(">[\\s\r\n]*<", "><");//("[\r\n]+", "");				
				String collectMsgSignature = signature.collectMsgSignature(response);
				ackResponse.setMsgSignature(collectMsgSignature);
				
				paths= saveRequestAndResponse(request, response==null?"RESPONSE ERROR":response, "PushPolicy/"+chassisNo);
				
			 	}catch (Exception e) {
			 		e.printStackTrace();
				}
				
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		//return ackResponse;
		Boolean status=false;
		
		
		try {
			String reqPath="Not Found";
			String resPath="Not Found";
			if(paths!=null && !paths.isEmpty()) {
				reqPath=paths.get("REQ_PATH");
				resPath=paths.get("RES_PATH");
			}
			
			List<TiraTrackingDetails> ttds=new ArrayList<TiraTrackingDetails>();
			for (int i = 0;req.getMotorCoverNoteRefRes().getFleetResDtl()!=null &&  i < req.getMotorCoverNoteRefRes().getFleetResDtl().size(); i++) {
				FleetResDtl fleetResDtl = req.getMotorCoverNoteRefRes().getFleetResDtl().get(i);
				
				status=("TIRA001".equals(fleetResDtl.getResponseStatusCode())
						||
						("TIRA214".equals(fleetResDtl.getResponseStatusCode()) 
								&& "Transaction successfully cancelled".equalsIgnoreCase(fleetResDtl.getResponseStatusDesc()
										)))?true:false;	
				
				TiraTrackingDetails tira=TiraTrackingDetails.builder()
						.requestId(req.getMotorCoverNoteRefRes().getFleetResHdr().getRequestId())
						.acknowledgementId(acknowledge)
						.responseId(req.getMotorCoverNoteRefRes().getFleetResHdr().getResponseId())
						.entryDate(new Date())
						.hitCount(0)
						.methodName("/covernote/non-life/motor/v2/fleet/acknowledge")
						.policyNo(policyNo)
						.status(status?"Y":"N")
						.statusCode(fleetResDtl.getResponseStatusCode())
						.statusDesc(fleetResDtl.getResponseStatusDesc())
						.chassisNo(fleetResDtl.getFleetEntry()+"")
						.tiraTrackingId(Long.valueOf(Instant.now().toEpochMilli()+Long.valueOf(String.valueOf(Math.random()*100))))
						.requestFilePath(reqPath)
						.responseFilePath(resPath)
						.build();
				ttds.add(tira);
			}
			
			tiraTrackRepo.saveAll(ttds);
		}catch (Exception e) {
			e.printStackTrace();
		}
		try {
			if(previousOne!=null && StringUtils.isNotBlank(previousOne.getPolicyNo())) {
				
				
				List<SectionDataDetails> sections=sectionDataRepo.findByQuoteNo(previousOne.getPolicyNo());
				for (int i = 0;req.getMotorCoverNoteRefRes().getFleetResDtl() !=null &&  i < req.getMotorCoverNoteRefRes().getFleetResDtl().size(); i++) {
					FleetResDtl fleetResDtl = req.getMotorCoverNoteRefRes().getFleetResDtl().get(i);
					sections.stream().filter(s-> s.getRiskId().compareTo(fleetResDtl.getFleetEntry().intValue())==0).forEach(new Consumer<SectionDataDetails>() {

						@Override
						public void accept(SectionDataDetails t) {
							// TODO Auto-generated method stub
							 
							boolean  status=("TIRA001".equals(fleetResDtl.getResponseStatusCode())
									||
									("TIRA214".equals(fleetResDtl.getResponseStatusCode()) 
											&& "Transaction successfully cancelled".equalsIgnoreCase(fleetResDtl.getResponseStatusDesc()
													)))?true:false;	
													
							t.setTiraResponseId(req.getMotorCoverNoteRefRes().getFleetResHdr().getResponseId());
							t.setResponseStatusCode(fleetResDtl.getResponseStatusCode());
							t.setResponseStatusDesc(fleetResDtl.getResponseStatusDesc());
							if(status) {
								t.setCoverNoteReferenceNo(fleetResDtl.getCoverNoteReferenceNumber());
								t.setStickerNumber(fleetResDtl.getStickerNumber());
							}		
						}
						
					});
				}
				sectionDataRepo.saveAll(sections);
				 
				
				HomePositionMaster hm = homePositionRepo.findByTiraRequestIdAndQuoteNo(req.getMotorCoverNoteRefRes().getFleetResHdr().getRequestId(),previousOne.getPolicyNo());
				if(hm!=null) {
					
					Long successCount=sections.stream().filter(t -> !StringUtils.isBlank(t.getCoverNoteReferenceNo())).count();
					
					hm.setTiraResponseId(req.getMotorCoverNoteRefRes().getFleetResHdr().getResponseId());
					hm.setResponseStatusCode((successCount.intValue()==sections.size())?"TIRA001":"MAAN001");
					hm.setResponseStatusDesc((successCount.intValue()==sections.size())?"FLEET POSTED":"SOME VEHICLE IS NOT POSTED");
					if(status) {
						hm.setCoverNoteReferenceNo(sections.get(0).getCoverNoteReferenceNo());
						hm.setStickerNumber(sections.get(0).getStickerNumber());
					}					
					homePositionRepo.save(hm);
				}
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return ackResponse;
	}
	
}
