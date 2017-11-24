package cn.edu.demo.chapter6.commandimpl;

import cn.edu.demo.chapter6.base.AbstractRequestCommand;
import cn.edu.demo.chapter6.base.IHandler;

/**
*@author WuJie
*@date 2017年11月24日下午2:59:25
*@version 1.0
**/
public class CompileCommand extends AbstractRequestCommand {
	
	public CompileCommand(IHandler handler) {
		// TODO Auto-generated constructor stub
		this.handler = handler;
	}
	
	@Override
	public IHandler getHandler() {
		// TODO Auto-generated method stub
		return this.handler;
	}
	
}
