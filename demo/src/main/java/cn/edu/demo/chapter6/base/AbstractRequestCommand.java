package cn.edu.demo.chapter6.base;
/**
*@author WuJie
*@date 2017年11月24日下午2:51:13
*@version 1.0
**/
public abstract class AbstractRequestCommand implements IRequestCommand {
	protected IHandler handler;
	
	public void execute() {
		IHandler handler = getHandler();
		handler.handle();
	}
	
	public abstract IHandler getHandler();
}
