package cn.edu.demo.chapter1;

public class DogSimulator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog1 = new ChihuahuaDog();
		System.out.println(dog1.looklike());
		dog1.performBark();
		dog1.performRun();
		
		Dog dog2 = new BullDog();
		System.out.println(dog2.looklike());
		dog2.performBark();
		dog2.performRun();
	}

}
