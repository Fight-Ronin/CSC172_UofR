/*
authored by Hanzhang Yin 2025
lab partner: Puhua Ye 2024
*/

// File : CaseSensitiveCompare.java


//Q6.1 Comparator
import java.util.Comparator;
public class CaseSensitiveCompare implements Comparator<String> {
public int compare(String lhs, String rhs) { 
	Integer [] length = {lhs.length(), rhs.length()};
	return length[0].compareTo(length[1]);
	}
}

