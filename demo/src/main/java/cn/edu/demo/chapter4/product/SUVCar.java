package cn.edu.demo.chapter4.product;

import cn.edu.demo.chapter4.factory.IPartFactory;

public class SUVCar extends Car {
	public SUVCar(IPartFactory factory) {
		// TODO Auto-generated constructor stub
		super(factory);
	}
	
	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return "\ni am SUV Car, the following is my configuration:\n" + 
		"Engine: " + this.engine + 
		"\nAMT: " + this.amt + 
		"\nTire: " + this.tire;
	}

}
