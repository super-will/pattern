package com.pattern.template;

/**
 * 冲橙汁
 * @author hcguo
 *
 */
public class OrangeJuice extends DrinkTemplate{

	@Override
	protected void addPowder() {
		//现在的黑心商贩都是加冲剂,
		System.out.println("加入橙子味冲剂");
		
	}

	@Override
	protected void packageDrink() {
		
		System.out.println("用装橙汁的包装打包橙汁");
		
	}
  
}
