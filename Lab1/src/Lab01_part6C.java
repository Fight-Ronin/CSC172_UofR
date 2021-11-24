/*
authored by Hanzhang Yin 2025
lab partner: Puhua Ye 2024
*/

import java.util.Comparator;

public class Lab01_part6C {
	
	//Q3
	public static <AnyType> AnyType findMax(AnyType [] Student, Comparator <? super AnyType> cmp) {
		int mIndex = 0;
		for (int i = 1; i<Student.length; i++ )
		if (cmp.compare(Student[i],Student[mIndex]) > 0 ) mIndex = i;
		return Student[mIndex]; 
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		String [] LastName = {"Xu","Ye","Zhou"};
		String [] FirstName = {"James", "Jim", "Jason"};
		Double [] gpa = {4.2, 3.6, 2.1};
		*/
		Student s1 = new Student("Henry","Yin",4.0);
		Student s2 = new Student("Jim","Ye",3.6);
		Student [] Studentarray = { s1,s2 };
		
		
		System.out.println(findMax(Studentarray, new StringCompare()));
		System.out.println(findMax(Studentarray, new gpaCompare()));

	}

}

class Student {
	//Defining instance object
	String FirstName;
	String LastName;
	Double gpa;
	
	public Student(String FirstName, String LastName, Double gpa){
		//this will only use in oop and it creates a instance use in other functions
		//this is a constructor function.
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.gpa = gpa;
		
	}
	public int compareTobyLastName(Student A) {
		return this.LastName.compareTo(A.LastName) ;
		//
		
	}
	public int compareTobyGpa(Student A) {
		return this.gpa.compareTo(A.gpa);
	}
	
	public String toString(){
		//Override original ToString function.
		return this.LastName + " " + this.FirstName;
		
	}
	
}

