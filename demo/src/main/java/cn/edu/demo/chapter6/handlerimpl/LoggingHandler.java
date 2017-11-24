package cn.edu.demo.chapter6.handlerimpl;

import cn.edu.demo.chapter6.base.AbstractHandler;

/**
*@author WuJie
*@date 2017年11月24日下午3:27:43
*@version 1.0
**/
public class LoggingHandler extends AbstractHandler {

	public void handle() {
		// TODO Auto-generated method stub
		//模拟编译时间
		try {
			Thread.sleep(1*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(getTime() + "---[LoggingHandler] Logging handler is Logging ---");
	}
	

}
