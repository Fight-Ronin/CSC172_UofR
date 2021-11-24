/*
authored by Hanzhang Yin 2025
lab partner: Puhua Ye 2024
*/

import java.util.Comparator;

public class Lab01_part6B {
	
	//Q2
	public static <AnyType> AnyType findMax(AnyType [] arr, Comparator <? super AnyType> cmp) {
		int mIndex = 0;
		for (int i = 1; i<arr.length; i++ )
		if (cmp.compare(arr[i],arr[mIndex]) < 0 ) mIndex = i;
		return arr[mIndex]; 
		}
			
	public static void main(String[] args) {
		String [] arr = {"ZEBRA", "alligator", "crocodiles"}; 
		
		System.out.println(findMax(arr, new CaseInsensitiveCompare()));
			}
}
