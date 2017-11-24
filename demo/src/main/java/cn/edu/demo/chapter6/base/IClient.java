package cn.edu.demo.chapter6.base;

import java.util.Queue;

/**
*@author WuJie
*@date 2017年11月24日下午2:44:28
*@version 1.0
**/
public interface IClient extends Runnable {
	public void commit(Queue<IRequestCommand> coQueue);
}
