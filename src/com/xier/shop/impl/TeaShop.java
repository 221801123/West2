package com.xier.shop.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import com.xier.Bubble;
import com.xier.Coconut;
import com.xier.Ingredient;
import com.xier.MilkTea;
import com.xier.exception.SoldOutException;
import com.xier.shop.Shop;
/**
 * 西二在线奶茶店类TeaShop
 * @author wuyongyi
 * 2019-12-04
 */
public class TeaShop implements Shop{
	private static List<Bubble> bubbleList=new ArrayList<Bubble>();//珍珠list
	private static List<Coconut> coconutList=new ArrayList<Coconut>();//椰果list
	@Override
	public void addIngredient(Ingredient ingredient) throws SoldOutException{
		if(ingredient instanceof Bubble){
			//添加珍珠
			this.addIngredient((Bubble)ingredient);
		}else if(ingredient instanceof Coconut){
			//添加椰果
			this.addIngredient((Coconut)ingredient);
		}else{
			throw new SoldOutException("参数错误");
		}
		System.out.println(ingredient.getName()+"添加完成");
	}
	
	private void addIngredient(Bubble bubble){
		bubbleList.add(new Bubble("Bubble",bubble.getProduceDate(),7));
	}
	private void addIngredient(Coconut coconut){
		coconutList.add(new Coconut("Coconut",coconut.getProduceDate(),5));
	}

	@Override
	public void saleMilkTea(MilkTea milkTea) throws SoldOutException {
		boolean isSaleSuccess=false;
		if(milkTea.getIngredient() instanceof Bubble){
			Iterator iterator=bubbleList.iterator();
		    while(iterator.hasNext()){
		    	Bubble bubble = (Bubble)iterator.next();
		    	//判断是否过期
		    	Calendar currentCalendar=Calendar.getInstance();
		    	currentCalendar.add(Calendar.DATE, -bubble.getQualityGuaranteePeriod());
		    	//若当前日期-保质期大于生产日期，则视为过期
		    	if(bubble.getProduceDate().getTimeInMillis()<currentCalendar.getTimeInMillis()){
		    		iterator.remove();//移除过期
		    		System.out.println(bubble.getName()+"过期移除");
		    	}else{
		    		iterator.remove();
		    		System.out.println(bubble.getName()+"销售移除");
		    		isSaleSuccess=true;
		    		break;
		    	}
		    }
		}else if(milkTea.getIngredient() instanceof Coconut){
			Iterator iterator=coconutList.iterator();
		    while(iterator.hasNext()){
		    	Coconut coconut = (Coconut)iterator.next();
		    	//判断是否过期
		    	Calendar currentCalendar=Calendar.getInstance();
		    	currentCalendar.add(Calendar.DATE, -coconut.getQualityGuaranteePeriod());
		    	//若当前日期-保质期大于生产日期，则视为过期
		    	if(coconut.getProduceDate().getTimeInMillis()<currentCalendar.getTimeInMillis()){
		    		iterator.remove();//移除过期
		    		System.out.println(coconut.getName()+"过期移除");
		    	}else{
		    		iterator.remove();
		    		System.out.println(coconut.getName()+"销售移除");
		    		isSaleSuccess=true;
		    		break;
		    	}
		    }
		}else{
			throw new SoldOutException("参数错误");
		}
	    if(!isSaleSuccess){
	    	throw new SoldOutException("售完");
	    }
	    System.out.println(milkTea.getName()+"销售完成");
	}

}
