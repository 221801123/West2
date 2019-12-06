package com.xier;

import java.util.Calendar;

import com.xier.util.CommonUtil;

/**
 * 椰果类Coconut（继承自配料类），过期时间：5 天
 * @author wuyongyi
 * 2019-12-04
 */
public class Coconut extends Ingredient{
	public Coconut(String name,Calendar produceDate,int qualityGuaranteePeriod){
		this.name=name;
		this.produceDate=produceDate;
		this.qualityGuaranteePeriod=qualityGuaranteePeriod;
	}
	public Coconut(String name){
		this.name=name;
	}

	@Override
	public String toString() {
		return "Coconut [name=" + name + ", produceDate=" + CommonUtil.convertCalendarToString(produceDate) + ", qualityGuaranteePeriod="
				+ qualityGuaranteePeriod + "]";
	}
}
