package com.xier;

import java.util.Calendar;

import com.xier.util.CommonUtil;
/**
 * 配料类
 * @author wuyongyi
 * 2019-12-04
 */
public abstract class Ingredient {
	protected String name;//配料名称
	protected Calendar produceDate;//生产日期
	protected int qualityGuaranteePeriod;//保质期
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Calendar getProduceDate() {
		return produceDate;
	}
	public void setProduceDate(Calendar produceDate) {
		this.produceDate = produceDate;
	}
	public int getQualityGuaranteePeriod() {
		return qualityGuaranteePeriod;
	}
	public void setQualityGuaranteePeriod(int qualityGuaranteePeriod) {
		this.qualityGuaranteePeriod = qualityGuaranteePeriod;
	}
	@Override
	public String toString() {
		System.out.println(produceDate);
		return "Ingredient [name=" + name + ", produceDate=" + CommonUtil.convertCalendarToString(produceDate) + ", qualityGuaranteePeriod="
				+ qualityGuaranteePeriod + "]";
	}
	
}
