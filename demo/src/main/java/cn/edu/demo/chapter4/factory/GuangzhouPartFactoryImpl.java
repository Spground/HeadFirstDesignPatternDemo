package cn.edu.demo.chapter4.factory;

import cn.edu.demo.chapter4.part.SmallAMTMadeinDalian;
import cn.edu.demo.chapter4.part.SmallEngineMadeinDalian;
import cn.edu.demo.chapter4.part.SmallTireMadeinDalian;
import cn.edu.demo.chapter4.part.base.AMT;
import cn.edu.demo.chapter4.part.base.Engine;
import cn.edu.demo.chapter4.part.base.Tire;

public class GuangzhouPartFactoryImpl implements IPartFactory{

	public Engine createEngine() {
		// TODO Auto-generated method stub
		return new SmallEngineMadeinDalian();
	}

	public Tire createTire() {
		// TODO Auto-generated method stub
		return new SmallTireMadeinDalian();
	}

	public AMT createAMT() {
		// TODO Auto-generated method stub
		return new SmallAMTMadeinDalian();
	}

}
