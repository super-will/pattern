package com.pattern.template;

/**
 * 泡咖啡
 * @author hcguo
 *
 */
public class Coffee extends DrinkTemplate {

	@Override
	protected void addPowder() {
         System.out.println("加入咖啡粉");
	}

	@Override
	protected void packageDrink() {
		System.out.println("用咖啡饮料包装打包咖啡");
	}
	
	@Override
	protected boolean NeedPackage() {
		return false;
	}

}
