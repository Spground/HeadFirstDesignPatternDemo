package cn.edu.demo.chapter4.store;

import cn.edu.demo.chapter4.product.Car;
//Factory Method
public abstract class CarStore {
	
	private Car car;
	
	public final void buyCar() {
		car = getCar();
		System.out.println("welcome!");
		System.out.println(car.getDesc());
	}
	
	/**
	 * Factory Method ==> delay the Class init to ChildrenClass
	 * @return
	 */
	protected abstract Car getCar();
}
