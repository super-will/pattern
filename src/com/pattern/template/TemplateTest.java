package com.pattern.template;

/**
 * 测试类
 * @author hcguo
 *
 */
public class TemplateTest {
    public static void main(String args[]){
    	
    	System.out.println("*******开始泡咖啡***********");
    	//泡咖啡
    	DrinkTemplate coffee = new Coffee();
    	coffee.prepareDrinkTemplate();
    	
    	
    	System.out.println("*******开始冲橙汁***********");
    	//冲橙汁
    	DrinkTemplate juice = new OrangeJuice();
    	juice.prepareDrinkTemplate();
    }
}
