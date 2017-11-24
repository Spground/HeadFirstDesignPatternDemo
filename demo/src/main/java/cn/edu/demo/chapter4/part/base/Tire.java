package cn.edu.demo.chapter4.part.base;
//轮胎
public abstract class Tire {
	public abstract String getTireDesc();
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getTireDesc();
	}
}
