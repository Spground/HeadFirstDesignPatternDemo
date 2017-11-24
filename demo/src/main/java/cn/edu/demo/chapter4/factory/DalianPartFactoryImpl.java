package cn.edu.demo.chapter4.factory;

import cn.edu.demo.chapter4.part.BigAMTMadeinGuangzhou;
import cn.edu.demo.chapter4.part.BigEngineMadeinGuangzhou;
import cn.edu.demo.chapter4.part.BigTireMadeinGuangzhou;
import cn.edu.demo.chapter4.part.base.AMT;
import cn.edu.demo.chapter4.part.base.Engine;
import cn.edu.demo.chapter4.part.base.Tire;

public class DalianPartFactoryImpl implements IPartFactory{

	public Engine createEngine() {
		// TODO Auto-generated method stub
		return new BigEngineMadeinGuangzhou();
	}

	public Tire createTire() {
		// TODO Auto-generated method stub
		return new BigTireMadeinGuangzhou();
	}

	public AMT createAMT() {
		// TODO Auto-generated method stub
		return new BigAMTMadeinGuangzhou();
	}

}
