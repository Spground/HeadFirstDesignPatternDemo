package cn.edu.demo.chapter2;

public class NewsPaperSubscriber implements ISubscriber{
	
	private IPublisher publisher;
	
	public NewsPaperSubscriber(IPublisher publisher) {
		this.publisher = publisher;
		this.publisher.subscribe(this);
	}
	
	public void publish(String breakNews) {
		// TODO Auto-generated method stub
		System.err.println("Thank you publisher, i have received the break news : " + breakNews);
	}
	
}
