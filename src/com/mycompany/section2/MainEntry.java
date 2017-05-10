/**
 * 
 */
package com.mycompany.section2;

/**
 * @author Kathleen Falcon
 *
 */
public class MainEntry {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		MyGenInterface<Integer, String> mgi1 = new MyGenClass(1, "Kathleen");
		MyGenInterface<Integer, Integer> mgi2 = new MyGenClass(1, 2017);
		
		Integer i1 = MyRegularClass.getSum(10, 20);
		Float f1 = MyRegularClass.getSum(100f, 200f);
			
		System.out.println("Key: " + mgi1.getKey() + "  Value: " + mgi1.getValue());
		System.out.println("Key: " + mgi2.getKey() + "  Value: " + mgi2.getValue());
		
		System.out.println("Integer: " + i1);
		System.out.println("Float: " + f1);
		
	}

}
