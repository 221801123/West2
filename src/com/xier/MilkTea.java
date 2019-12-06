package com.xier;
/**
 * 奶茶类MilkTea，每杯奶茶都有自己的名字（如“奶茶1”，“奶茶2”），
以及一个配料类成员变量（具体是什么配料取决于实际情况，即多态）
 * @author wuyongyi
 * 2019-12-04
 */
public class MilkTea {
	private String name;//奶茶名
	private Ingredient ingredient;//奶茶配料
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Ingredient getIngredient() {
		return ingredient;
	}
	public void setIngredient(Ingredient ingredient) {
		this.ingredient = ingredient;
	}
	@Override
	public String toString() {
		return "MilkTea [name=" + name + ", ingredient=" + ingredient + "]";
	}
}
