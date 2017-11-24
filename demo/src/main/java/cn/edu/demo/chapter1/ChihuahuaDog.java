package cn.edu.demo.chapter1;
/**
 * Chihuahua Dog
 * @author asus
 *
 */
public class ChihuahuaDog extends Dog {
	
	
	public ChihuahuaDog() {
		this.color = "yellow";
		this.size = "small";
		this.ibark = new ChihuahuaBarkImpl();
		this.irun = new ChihuahuaRunImpl();
	}
	@Override
	public String looklike() {
		// TODO Auto-generated method stub
		return "i am Chihuahua";
	}
	
}
