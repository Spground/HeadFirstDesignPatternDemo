package cn.edu.demo.chapter4;

import cn.edu.demo.chapter4.store.CarStore;
import cn.edu.demo.chapter4.store.GTCarStore;
import cn.edu.demo.chapter4.store.SUVCarStore;

public class FactoryPatternRun {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarStore storeA = new SUVCarStore();
		CarStore storeB = new GTCarStore();
		buybuybuy(storeA);
		buybuybuy(storeB);
	}
	
	private static void buybuybuy(CarStore castore) {
		System.out.println("\nI have money, i am going to buy car,lalalal~~~");
		castore.buyCar();
	}

}
