package com.xier.shop;

import com.xier.Ingredient;
import com.xier.MilkTea;
import com.xier.exception.SoldOutException;
/**
 * 接口
 * @author wuyongyi
 * 2019-12-04
 */
public interface Shop {
	/**
	 * 添加配料
	 * @param ingredient 配料类
	 * @throws SoldOutException
	 */
	public void addIngredient(Ingredient ingredient)throws SoldOutException;
	/**
	 * 出售奶茶
	 * @param milkTea 奶茶类
	 * @throws SoldOutException
	 */
	public void saleMilkTea(MilkTea milkTea) throws SoldOutException;
}
