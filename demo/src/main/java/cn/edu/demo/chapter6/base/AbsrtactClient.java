package cn.edu.demo.chapter6.base;

import java.util.Queue;
import java.util.concurrent.BlockingQueue;

/**
*@author WuJie
*@date 2017年11月24日下午2:48:26
*@version 1.0
**/
public abstract class AbsrtactClient implements IClient {
	
	protected BlockingQueue<IRequestCommand> queue;
	protected Queue<IRequestCommand> coQueue;
	
	public abstract BlockingQueue<IRequestCommand> getQueue();
	
	public abstract Queue<IRequestCommand> getCommitQueue();
	
	public void run() {
		// TODO Auto-generated method stub
		BlockingQueue<IRequestCommand> queue = getQueue();
		Queue<IRequestCommand> coQueue = getCommitQueue();
		if (queue == null || coQueue == null) 
			throw new RuntimeException("queue or coQueue should not be null!");
		while (coQueue.size() > 0) {
			if (queue.size() > 1000)
				try {
					Thread.sleep(30*1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
			try {
				queue.put(coQueue.poll());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
