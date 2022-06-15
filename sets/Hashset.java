package sets;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Hashset {
	

	void remove() {
		HashSet<String> Obj = new HashSet<String>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = scan.nextInt();
		for(int charindex=0; charindex<size;charindex++) {
			System.out.println("Enter the colours");
			Obj.add(scan.next());
		
		System.out.println("Added colours are :" + Obj);
		}
		System.out.println("Enter colour to be remove");
		Obj.remove(scan.next());	
		System.out.println("After removing a colour:" +Obj);
		}

	void removeall() {
		HashSet<String> Obj1 = new HashSet<String>();
		Obj1.add("White1"); 
		Obj1.add("Black1");
		Obj1.add("Blue1");
		Obj1.add("Green1");
		Obj1.add("Maroon1");
		System.out.println("Added colours are:" +Obj1);
		Obj1.removeAll(Obj1);
		System.out.println("Removing all colours :" + Obj1);
		
	}
	void removeif() {
		HashSet<String> Obj2 = new HashSet<String>();
		Obj2.add("White2");
		Obj2.add("Black2");
		Obj2.add("Blue2");
		Obj2.add("Green2");
		Obj2.add("Maroon2");
		System.out.println("Added colours are :"  +Obj2);
		Obj2.removeIf(str->str.contains("Maroon2"));
		System.out.println("Removing Maroon2 :" +Obj2);
		
	}
	void clear() {
		HashSet<String> Obj3 = new HashSet<String>();
		Obj3.add("White3");
		Obj3.add("Black3");
		Obj3.add("Blue3");
		Obj3.add("Green3");
		Obj3.add("Maroon3");
		System.out.println("Added colours are :"  +Obj3);
		Obj3.clear();
		System.out.println("Clearing all colours :" +Obj3);
	
	}
}
		
	
