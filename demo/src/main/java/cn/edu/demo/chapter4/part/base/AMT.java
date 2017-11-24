package cn.edu.demo.chapter4.part.base;

//变速箱
public abstract class AMT {
	public abstract String getAMTDesc();
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getAMTDesc();
	}
}
