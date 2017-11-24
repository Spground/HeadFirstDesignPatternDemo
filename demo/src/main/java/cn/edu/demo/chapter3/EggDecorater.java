package cn.edu.demo.chapter3;
/**
 * Add a egg, price is ��1.00
 * @author asus
 *
 */
public class EggDecorater extends AbstractCakeDecorator{
	
	public EggDecorater(AbstractCakeComponent component) {
		this.component = component;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.component.getDescription() + ", Egg";
	}

	@Override
	protected double cost() {
		// TODO Auto-generated method stub
		return this.component.cost() + 1.00;
	}
	
}
