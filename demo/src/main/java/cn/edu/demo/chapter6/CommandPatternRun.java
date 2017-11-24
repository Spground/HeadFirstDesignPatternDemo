package cn.edu.demo.chapter6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;

import cn.edu.demo.chapter6.base.IClient;
import cn.edu.demo.chapter6.base.IRequestCommand;
import cn.edu.demo.chapter6.base.IWorker;
import cn.edu.demo.chapter6.clientimpl.Client;
import cn.edu.demo.chapter6.commandimpl.CompileCommand;
import cn.edu.demo.chapter6.commandimpl.DownloadCommand;
import cn.edu.demo.chapter6.commandimpl.LoggingCommand;
import cn.edu.demo.chapter6.handlerimpl.CompileHandler;
import cn.edu.demo.chapter6.handlerimpl.DownloadHandler;
import cn.edu.demo.chapter6.handlerimpl.LoggingHandler;
import cn.edu.demo.chapter6.workerimpl.Woker;

/**
*@author WuJie
*@date 2017年11月24日下午3:42:17
*@version 1.0
**/
public class CommandPatternRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//新建命令对象
		Queue<IRequestCommand> coQueue = new LinkedList<IRequestCommand>();
		for (int i = 0; i < 500; i++) {
			IRequestCommand command = null;
			int j = (int)(Math.random()*10);
			if (j % 3 == 0 )
				command = new CompileCommand(new CompileHandler());
			else if (j % 3 == 1)
				command = new DownloadCommand(new DownloadHandler());
			else
				command = new LoggingCommand(new LoggingHandler());
			coQueue.add(command);
		}
		
		
		//初始化client 客户端
		BlockingQueue<IRequestCommand> queue = new LinkedBlockingQueue<IRequestCommand>();
		IClient client = new Client(queue);
		client.commit(coQueue);
		
		
		//初始化worker 方法调用请求者
		IWorker work1 = new Woker(queue);
		IWorker work2 = new Woker(queue);
		IWorker work3 = new Woker(queue);
		IWorker work4 = new Woker(queue);
		
		new Thread(client).start();
		
		//方法调用请求者 Worker 和 方法调用接收者 Handler 解耦了，Worker 不要知道 Handler 的方法细节
		//他俩通过Command命令对象进行沟通，Worker只面向Command
		
		//换一个角度理解：Client应该知道一切细节，比如Handler怎么实现，比如Command是哪一种Command，因为毕竟它
		//是所有动作的发起者；因此它负责创建Command和指定对应的Handler是很符合逻辑的；而Worker只是一个被动执行任务的线程或计算单位
		//它要做的仅仅是接收任务，执行，接收任务，执行。。。
		
		//
		
		new Thread(work1).start();
		new Thread(work2).start();
		new Thread(work3).start();
		new Thread(work4).start();
		
	}

}
