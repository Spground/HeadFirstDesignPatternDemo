package cn.edu.demo.chapter6.clientimpl;

import java.util.Queue;
import java.util.concurrent.BlockingQueue;

import cn.edu.demo.chapter6.base.AbsrtactClient;
import cn.edu.demo.chapter6.base.IRequestCommand;

/**
*@author WuJie
*@date 2017年11月24日下午3:31:08
*@version 1.0
**/
public class Client extends AbsrtactClient {
	
	public Client(BlockingQueue<IRequestCommand> queue) {
		// TODO Auto-generated constructor stub
		this.queue = queue;
	}
	

	@Override
	public BlockingQueue<IRequestCommand> getQueue() {
		// TODO Auto-generated method stub
		return this.queue;
	}

	@Override
	public Queue<IRequestCommand> getCommitQueue() {
		// TODO Auto-generated method stub
		return this.coQueue;
	}


	public void commit(Queue<IRequestCommand> coQueue) {
		// TODO Auto-generated method stub
		this.coQueue = coQueue;
	}	

}
