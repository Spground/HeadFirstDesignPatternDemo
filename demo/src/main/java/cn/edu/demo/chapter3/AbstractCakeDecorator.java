package cn.edu.demo.chapter3;

public abstract class AbstractCakeDecorator extends AbstractCakeComponent {
	protected AbstractCakeComponent component;
    public abstract String getDescription();
}
