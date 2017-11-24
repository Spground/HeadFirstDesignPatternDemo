package cn.edu.demo.chapter6.commandimpl;

import cn.edu.demo.chapter6.base.AbstractRequestCommand;
import cn.edu.demo.chapter6.base.IHandler;

/**
*@author WuJie
*@date 2017年11月24日下午3:28:40
*@version 1.0
**/
public class DownloadCommand extends AbstractRequestCommand {

	public DownloadCommand(IHandler handler) {
		// TODO Auto-generated constructor stub
		this.handler = handler;
	}
	
	@Override
	public IHandler getHandler() {
		// TODO Auto-generated method stub
		return this.handler;
	}
	
}
