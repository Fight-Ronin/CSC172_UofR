/*
authored by Hanzhang Yin 2025
lab partner: Puhua Ye 2024
*/

// File : CaseSensitiveCompare.java
import java.util.Comparator;

//Q6.3.1 comparator for LastName
public class StringCompare implements Comparator<Student> 
{
	
	public int compare(Student lhs, Student rhs) 

{
	return rhs.compareTobyLastName(lhs);
} 

}
