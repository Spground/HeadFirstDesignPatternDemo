package cn.edu.demo.chapter6.base;

import java.util.concurrent.BlockingQueue;

/**
*@author WuJie
*@date 2017年11月24日下午3:04:47
*@version 1.0
**/
public abstract class AbstractWoker implements IWorker {
	public abstract BlockingQueue<IRequestCommand> getQueue();
	
	public void run() {
		// TODO Auto-generated method stub
		BlockingQueue<IRequestCommand> queue = getQueue();
		if (queue == null)
			throw new RuntimeException("BlockingQueue should not be null");
		while (true) {
			try {
				IRequestCommand command = queue.take();
				command.execute();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
