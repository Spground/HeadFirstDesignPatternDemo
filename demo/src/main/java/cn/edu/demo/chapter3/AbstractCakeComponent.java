package cn.edu.demo.chapter3;

public abstract class AbstractCakeComponent  {

	String description = "Unkown description";
	public String getDescription() {
		// TODO Auto-generated method stub
		return description;
	}
	
	protected abstract double cost();
}
