/*
authored by Hanzhang Yin 2025
lab partner: Puhua Ye 2024
*/

// File : CaseInensitiveCompare.java


//Q6.2 Comparator
import java.util.Comparator;
public class CaseInsensitiveCompare implements Comparator<String>{
	
	public int compare(String lhs, String rhs) 
	{ 
	return rhs.compareToIgnoreCase(lhs);
	} 
}
