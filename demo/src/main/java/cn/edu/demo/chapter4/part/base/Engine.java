package cn.edu.demo.chapter4.part.base;
//发动机
public abstract class Engine {
	public abstract String getEngineDesc();
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getEngineDesc();
	}
}
