package cn.edu.demo.chapter6.base;

import java.util.Date;

/**
*@author WuJie
*@date 2017年11月24日下午2:49:45
*@version 1.0
**/
public abstract class AbstractHandler implements IHandler {
	
	public AbstractHandler() {
		// TODO Auto-generated constructor stub
	}
	
	public String getTime() {
		Date date = new Date(System.currentTimeMillis());
		return date.toString();
	}
}
