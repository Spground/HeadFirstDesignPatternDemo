package cn.edu.demo.chapter2;

interface IPublisher {
	
	/**
	 * add subscriber into the register list
	 */
	void subscribe(ISubscriber subscriber);
	
	/**
	 * remove subscriber form the register list
	 */
	void unsubscribe(ISubscriber subscriber);
	
	/**
	 * notify subscribers registered in the list while publisher's status has changed 
	 */
	void notifySubscribers();
}
