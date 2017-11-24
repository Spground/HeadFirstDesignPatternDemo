package cn.edu.demo.chapter4.store;

import cn.edu.demo.chapter4.factory.DalianPartFactoryImpl;
import cn.edu.demo.chapter4.product.Car;
import cn.edu.demo.chapter4.product.GTCar;

public class GTCarStore extends CarStore{

	@Override
	protected Car getCar() {
		// TODO Auto-generated method stub
		return new GTCar(new DalianPartFactoryImpl());
	}

}
