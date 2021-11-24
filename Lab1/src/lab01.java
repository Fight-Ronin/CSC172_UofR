/*
authored by Hanzhang Yin 2025
lab partner: Puhua Ye 2024
*/

public class lab01 {
// Main method = entry point of a program.
// When mean method 编译后里面所有的程序都会被run。
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer [] intArry = {1, 2, 3, 4, 5 };
		Double [] doubArry = {1.1, 2.2, 3.3, 4.4}; 
		Character [] charArray = {'H','E','L', 'L', 'O' }; 
		String [] strArray = {"once", "upon", "a", "time" };
		printarray(intArry);
		printarray(doubArry);
		printarray(charArray);
		printarray(strArray);
		
		
		System.out.println("max Integer is : " + getMax(intArry));
		System.out.println("max Double is : "+ getMax(doubArry));
		System.out.println("max Character is : " + getMax(charArray));
		System.out.println("max String is : " + getMax(strArray));
		
	}
	
	//Q1
	
	public static void printarray(Object [] inputArray){
		// public, private, protected, default Define 函数的access control
		// Static 是一种状态，对应oop的non-static
		// void: return nothing
		//Object is a Class, java 中所有class的superClass
	
		for (int i = 0; i < inputArray.length; i++) 
		{
				System.out.print(inputArray[i]);
				System.out.print(",");
				//print出来并且换行
		}
		System.out.println();
	}
	
	
	
	
	
	//Overloading = function name 一样然后return type OR input type不一样.
	
	//Q2
	
	/*
	//method of Integer
	public static void printarray(Integer [] inputArray) {
		for (Integer i: inputArray) 
			// New format of for loop = for i in xxx in Python
			{
				System.out.print(i);
				System.out.print(",");
			}
			System.out.println();
	}
	
	
	//method of Double
	 public static void printarray(Double [] inputArray) {
		 for (double i: inputArray) 
		 {
			 System.out.print(i);
			 System.out.print(",");
		 }
		 System.out.println();
	 }
	
	
	//method of String
	public static void pirntarray(String [] inputArray) {
		for (String i: inputArray)
		{
			System.out.print(i);
			System.out.print(",");
		}
		System.out.println();
	}
	
	//method of Character
	public static void printarray(Character [] inputArray) {
		for (Character i: inputArray) 
		{
			System.out.print(i);
			System.out.print(",");
			
		}
		System.out.println();
	}
	*/
	
	
	
	//Q3
	
	/*
	//Generic is 一个功能可以灵活覆盖掉variable的属性
	public static <A> void printarray (A [] inputArray)
	{
		for (A i: inputArray)
		{
			System.out.print(i);
			System.out.print(",");
		}
		System.out.println();
			
	}
	*/
	
	//Q4
	
	/*
	public static Comparable getMax(Comparable [] a)
	{
		// Comparable is an interface (一种类型) 可以表示所有可以被比较的数据类型统称。
		Comparable max = a[0]; 
		
		for(Comparable i : a) 
		{
		//for i in a in python
			if (i.compareTo(max)>0)
			{
				max = i;
			}	
		}
		return max;
		
	} 
	*/
	
	//Q5
	
	public static <A extends Comparable<A> > A getMax(A [] a)
	{
		// Comparable is a type 表示所有可以被比较的数据类型统称。
		// extends A creates generic which can be comparable, ensure type safety
		A max = a[0]; 
		
		for(A i : a) 
		{
		//for i in a in python
			if (i.compareTo(max) > 0)
			{
				max = i;
			}	
		}
		return max;
		
	}
	
	
	
	

	
} 
