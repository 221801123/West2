package com.xier.test;

import java.text.ParseException;

import com.xier.Bubble;
import com.xier.Coconut;
import com.xier.MilkTea;
import com.xier.exception.SoldOutException;
import com.xier.shop.impl.TeaShop;
import com.xier.util.CommonUtil;
/**
 * 测试类
 * @author wuyongyi
 * 2019-12-04
 */
public class Test {
	public static void main(String[] args) throws ParseException {
		try {
			TeaShop ts=new TeaShop();
			Bubble bubble=new Bubble("Bubble",CommonUtil.getProduceDate("2019-12-02"),7);
			//添加配料
			ts.addIngredient(bubble);
			
			Coconut coconut=new Coconut("Coconut",CommonUtil.getProduceDate("2019-12-02"),5);
			//添加配料
			ts.addIngredient(coconut);

			//我要一杯珍珠奶茶：奶茶1
			String name="奶茶1";
			bubble=new Bubble("Bubble");
			
			MilkTea milkTea=new MilkTea();
			milkTea.setName(name);
			milkTea.setIngredient(bubble);

			//出售珍珠奶茶
			ts.saleMilkTea(milkTea);

			//我要一杯椰果奶茶：奶茶1
			name="奶茶2";
			coconut=new Coconut("Coconut");
			
			milkTea.setName(name);
			milkTea.setIngredient(coconut);

			//出售椰果奶茶
			ts.saleMilkTea(milkTea);
			
		} catch (SoldOutException e) {
			e.printStackTrace();
		}
		
	}
}
