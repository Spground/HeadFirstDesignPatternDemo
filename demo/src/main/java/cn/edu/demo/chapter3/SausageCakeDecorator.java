package cn.edu.demo.chapter3;

public class SausageCakeDecorator extends AbstractCakeDecorator{
	
	public SausageCakeDecorator(AbstractCakeComponent component) {
		// TODO Auto-generated constructor stub
		this.component = component;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.component.getDescription() + ", Sausage";
	}

	@Override
	protected double cost() {
		// TODO Auto-generated method stub
		return this.component.cost() + 2.00;
	}

}
