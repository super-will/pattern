package com.pattern.template;

/**
 * 适配器模式,模板方法
 * @author hcguo
 *
 */
public abstract class DrinkTemplate {
      
	/**
     *准备饮料
     */
    public final void prepareDrinkTemplate(){
    	  /*
    	   * step1煮水
    	   */
    	  boilWater();
    	  /*
    	   * step2加入饮料颗粒或茶叶或其它冲剂到杯中
    	   */
    	  addPowder();
    	  /*
    	   * step3导入水到饮料杯中
    	   */
    	  putIntoCup();
    	  /*
    	   * step4用对应包装打包饮料
    	   * 子类中可决定是否需要打包或者堂食
    	   */
    	  if(NeedPackage()){
        	  packageDrink();  
    	  }
      }

	protected boolean NeedPackage() {
		return true;
	}


	/**
	 * 这是通用方法，无需子类重写
	 */
	private void boilWater() {
		System.out.println("煮水");	
	}

	/**
	 * 具体饮料加不同的饮料冲级，由子类实现
	 */
	protected abstract void addPowder();

	/**
	 * 这是通用方法，无需子类重写
	 */
	private void putIntoCup() {
		System.out.println("倒入杯中");
		
	}
	
	/**
	 * 不同的饮料打不通的包装，由子类实现
	 */
	protected abstract void packageDrink();

}
