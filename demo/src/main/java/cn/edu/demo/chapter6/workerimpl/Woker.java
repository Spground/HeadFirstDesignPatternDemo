package cn.edu.demo.chapter6.workerimpl;

import java.util.concurrent.BlockingQueue;

import cn.edu.demo.chapter6.base.AbstractWoker;
import cn.edu.demo.chapter6.base.IRequestCommand;

/**
*@author WuJie
*@date 2017年11月24日下午3:04:15
*@version 1.0
**/
public class Woker extends AbstractWoker {
	
	BlockingQueue<IRequestCommand> queue = null;
	
	public Woker(BlockingQueue<IRequestCommand> queue) {
		this.queue = queue;
	}
	
	@Override
	public BlockingQueue<IRequestCommand> getQueue() {
		// TODO Auto-generated method stub
		return this.queue;
	}

}
