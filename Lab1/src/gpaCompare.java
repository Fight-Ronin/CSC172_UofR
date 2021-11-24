/*
authored by Hanzhang Yin 2025
lab partner: Puhua Ye 2024
*/

import java.util.Comparator;

//Q6.3.2 comparator for gpa
public class gpaCompare implements Comparator<Student> {

	public int compare(Student lhs, Student rhs)
	{ 
	return lhs.compareTobyGpa(rhs);
	}
}
