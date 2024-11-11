package com.maan.eway.tira.util;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.function.Function;

import com.maan.eway.bean.PolicyCoverData;
import com.maan.eway.req.push.DiscountOffered;
import com.maan.eway.req.push.DiscountsOffered;
import com.maan.eway.req.push.RiskCovered;
import com.maan.eway.req.push.TaxCharged;
import com.maan.eway.req.push.TaxesCharged;

public class CoverFromData  implements Function<PolicyCoverData,RiskCovered>{
	
	private String filterBy;
	
	private List<DiscountOffered> discounts;
	private List<DiscountOffered> loadings;
	private List<TaxCharged> taxes;
	
	public CoverFromData(String filterBy, List<DiscountOffered> discounts, List<DiscountOffered> loadings, List<TaxCharged> taxes) {
		super();
		this.filterBy = filterBy;
		this.discounts=discounts;
		this.loadings=loadings;
		this.taxes=taxes;
		
	}
	@Override
	public RiskCovered apply(PolicyCoverData t) {
		if(t.getCoverageType().equalsIgnoreCase(filterBy) && t.getPremiumAfterDiscountFc().doubleValue()>0D) {
			
			double loading =(loadings!=null && loadings.size()>0)?loadings.stream().mapToDouble(e-> Double.parseDouble(e.getDiscountAmount())).sum():0D;
			RiskCovered r=RiskCovered.builder()
						.discountsOfferedBean(DiscountsOffered.builder().discountOfferedBeanList(discounts).build())
						//.isMulti(null)
						.premiumAfterDiscount("Y".equals(t.getMinimumPremiumYn())?t.getPremiumExcludedTaxLc().toPlainString(): t.getPremiumAfterDiscountFc().toPlainString())
						.premiumBeforeDiscount("Y".equals(t.getMinimumPremiumYn())?t.getPremiumExcludedTaxLc().toPlainString():t.getPremiumBeforeDiscountFc().add(new BigDecimal(loading)).toPlainString())
						.premiumIncludingTax(t.getPremiumIncludedTaxFc().toPlainString())
						//.premiumRate(t.getRegulatoryRate()==null?String.valueOf(t.getRate()/100) : t.getRegulatoryRate().divide(new BigDecimal("100"),3, RoundingMode.HALF_UP).toPlainString())
						.premiumRate("A".equals(t.getCalcType())?"0":String.valueOf((Double) t.getActualRate().doubleValue()/100))
						.riskCode(t.getRegulatoryCode())
						.sumInsured(t.getRegulatorySuminsured()==null?t.getSumInsured().toPlainString():t.getRegulatorySuminsured().toPlainString())
						.sumInsuredEquivalent(t.getRegulatorySuminsured().toPlainString())
						.taxesChargedBean(TaxesCharged.builder().taxChargedBean(taxes).build())
						//.taxChargedBean(taxes)
						.premiumExcludingTaxEquivalent(t.getPremiumExcludedTaxLc().toPlainString())
						.build();
			
			return r;
		}
		return null;
	}

}
