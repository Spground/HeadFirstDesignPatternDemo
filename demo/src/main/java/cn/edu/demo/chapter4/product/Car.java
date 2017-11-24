package cn.edu.demo.chapter4.product;

import cn.edu.demo.chapter4.factory.IPartFactory;
import cn.edu.demo.chapter4.part.base.AMT;
import cn.edu.demo.chapter4.part.base.Engine;
import cn.edu.demo.chapter4.part.base.Tire;

public abstract class Car {
	protected Engine engine;
	protected Tire tire;
	protected AMT amt;

	protected IPartFactory factory;

	public Car(IPartFactory factory) {
		// TODO Auto-generated constructor stub
		this.factory = factory;
		this.amt = this.factory.createAMT();
		this.engine = this.factory.createEngine();
		this.tire = this.factory.createTire();
	}

	public abstract String getDesc();
}
