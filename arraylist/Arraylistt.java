package arraylist;

import java.util.ArrayList;

public class Arraylistt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList <Integer>name = new ArrayList<Integer>();
name.add(1);
name.add(2);
name.add(3);
name.add(1);//allow duplicates
System.out.println(name);
name.set(3, 4);
System.out.println(name);
System.out.println(name.get(2));//returns the value stored in index
System.out.println(name.indexOf(4));//to declare position
	}

}
//collection iterator class- parent class (it will go next)