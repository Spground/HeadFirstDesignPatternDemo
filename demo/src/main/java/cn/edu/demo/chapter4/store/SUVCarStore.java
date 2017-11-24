package cn.edu.demo.chapter4.store;

import cn.edu.demo.chapter4.factory.GuangzhouPartFactoryImpl;
import cn.edu.demo.chapter4.product.Car;
import cn.edu.demo.chapter4.product.SUVCar;

public class SUVCarStore extends CarStore{

	@Override
	protected Car getCar() {
		// TODO Auto-generated method stub
		return new SUVCar(new GuangzhouPartFactoryImpl());
	}

}
