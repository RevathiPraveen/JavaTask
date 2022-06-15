package sets;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;
public class Settypes {
	
	void hashSet() {
		HashSet<Integer> ohashset = new HashSet<Integer>(); 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = scan.nextInt();
		for( int charindex=0;charindex<size;charindex++) {
			System.out.println("Enter the numbers");
			ohashset.add(scan.nextInt());
			System.out.println("Adding all elements :" +ohashset);
		}
		System.out.println("Enter addtional elements to add");
		ohashset.add(scan.nextInt());
		System.out.println("Adding Additional numbers :" +ohashset);
	
	}
	void linkedhashset() {
		LinkedHashSet<String> oLinkedhashset = new LinkedHashSet<String>();	
		oLinkedhashset.add("Summer");
		oLinkedhashset.add("Winter");
		oLinkedhashset.add("Monsoon");
		oLinkedhashset.add("Autumn");
		oLinkedhashset.add("Spring");	
		System.out.println("Adding all Seasons :" +oLinkedhashset);
		LinkedHashSet<String> oLinkedhashset1 = new LinkedHashSet<String>();
		oLinkedhashset1.add("Rain");
		oLinkedhashset1.add("Snow");
		oLinkedhashset1.addAll(oLinkedhashset);
		System.out.println("Adding additional features :" +oLinkedhashset1);
		}
	void treeSet() {
		TreeSet<String> otreeset = new TreeSet<String>();
		otreeset.add("Apple");
		otreeset.add("Redmi");
		otreeset.add("Lenova");
		otreeset.add("Oneplus");
		otreeset.add("Samsung");
		System.out.println("Adding all Mobiles :" +otreeset);
		TreeSet<String> otreeset1 = new TreeSet<String>();
		otreeset1.add("Galaxy");
		otreeset1.add("Nord");
		otreeset1.addAll(otreeset);
		System.out.println("Adding additional features :"  +otreeset1);
		
	}
		
	}


