package cn.edu.demo.chapter3;

public class LettuceCakeDecorator extends AbstractCakeDecorator{
	
	public LettuceCakeDecorator(AbstractCakeComponent component) {
		// TODO Auto-generated constructor stub
		this.component = component;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.component.getDescription() + ", Lettuce";
	}

	@Override
	protected double cost() {
		// TODO Auto-generated method stub
		return this.component.cost() + 1.00;
	}
	
}
