package cn.edu.demo.chapter3;

public class DecoratorPatternRun {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractCakeComponent eggCake = new EggPieCakeComponent();
		
		//using Factory and Builder can make the following code more elegant
		eggCake = new EggDecorater(eggCake);
		eggCake = new SausageCakeDecorator(eggCake);
		
		System.err.println("The descr is " + eggCake.getDescription());
		System.err.println("The cost is " + eggCake.cost());
		
	}

}
