package cn.edu.demo.chapter4.factory;

import cn.edu.demo.chapter4.part.base.AMT;
import cn.edu.demo.chapter4.part.base.Engine;
import cn.edu.demo.chapter4.part.base.Tire;

//Abstract Factory
public interface IPartFactory {
	Engine createEngine();
	Tire createTire();
	AMT createAMT();
}
