package cn.edu.demo.chapter2;

import java.util.ArrayList;
import java.util.List;

public class NewsPaperPublisher implements IPublisher{
	
	/**
	 * the registering observer list
	 */
	private List<ISubscriber> list = new ArrayList<ISubscriber>();
	
	/**
	 * the status of subject
	 */
	private String breakNews;
	


	public void subscribe(ISubscriber subscriber) {
		// TODO Auto-generated method stub
		if(subscriber != null)
			list.add(subscriber);
	}

	public void unsubscribe(ISubscriber subscriber) {
		// TODO Auto-generated method stub
		if(subscriber != null)
			list.remove(subscriber);
	}

	public void notifySubscribers() {
		// TODO Auto-generated method stub
		for(int i = 0; i < list.size(); i++) {
			ISubscriber subscriber = list.get(i);
			subscriber.publish(breakNews);
		}
	}
	
	protected void setBreakNews(String breakNews) {
		onBreakNewsHappened(breakNews);
	}
	
	public void onBreakNewsHappened(String breakNews) {
		this.breakNews = breakNews;
		notifySubscribers();
	}
}
