package cn.edu.demo.chapter1;

public class BullDog extends Dog {
	
	
	public BullDog() {
		this.color = "brown";
		this.size = "midlle";
		this.ibark = new BullDogBarkImpl();
		this.irun = new BullDogRunImpl();
	}
	@Override
	public String looklike() {
		// TODO Auto-generated method stub
		return "i am BullDog";
	}
	
}
