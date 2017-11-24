package cn.edu.demo.chapter1;

public abstract class Dog {
	protected String size;
	protected String color;
	
	protected IBark ibark;
	protected IRun irun;
	
	public Dog() {
		
	}
	
	public abstract String looklike();
	
	/**
	 * this is a variable part, which should be abstracted and encapsulated as a behavior Class 
	 */
	public void performRun() {
		irun.run();
	}
	
	/**
	 * this is a variable part, which should be abstracted and encapsulated as a behavior Class
	 */
	public void performBark() {
		ibark.bark();
	}
}
