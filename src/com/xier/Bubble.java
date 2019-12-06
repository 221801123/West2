package com.xier;

import java.util.Calendar;

import com.xier.util.CommonUtil;

/**
 * 珍珠类Bubble（继承自配料类），过期时间：7 天。
 * @author wuyongyi
 * 2019-12-04
 */
public class Bubble extends Ingredient{
	public Bubble(String name,Calendar produceDate,int qualityGuaranteePeriod){
		this.name=name;
		this.produceDate=produceDate;
		this.qualityGuaranteePeriod=qualityGuaranteePeriod;
	}
	
	public Bubble(String name){
		this.name=name;
	}

	@Override
	public String toString() {
		return "Bubble [name=" + name + ", produceDate=" + CommonUtil.convertCalendarToString(produceDate) + ", qualityGuaranteePeriod="
				+ qualityGuaranteePeriod + "]";
	}
}
