package cn.edu.demo.chapter2;

public class ObserverPatternRun {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewsPaperPublisher publisher = new NewsPaperPublisher();
		new NewsPaperSubscriber(publisher);
		publisher.setBreakNews("911 happened in USA");
	}

}
