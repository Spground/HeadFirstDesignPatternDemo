package cn.edu.demo.chapter4.product;

import cn.edu.demo.chapter4.factory.IPartFactory;

public class GTCar extends Car{

	public GTCar(IPartFactory factory) {
		super(factory);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return "\ni am GT Car, the following is my configuration:\n" + 
				"Engine: " + this.engine + 
				"\nAMT: " + this.amt + 
				"\nTire: " + this.tire;
	}

}
