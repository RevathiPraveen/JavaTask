package sets;
import java.util.Scanner;
public class Alpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Alphabetic=new Scanner(System.in);
		System.out.println("Enter the Letter");
		String Alpha= Alphabetic.next();
		int n=Alphabetic.nextInt();
switch(Alpha){
case"C":
{
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
			if(i==1||j==1||i==n)
				System.out.print("*");
		
			else
			System.out.print(" ");
		}
		System.out.println("");
	}
	break;
	}
	default:
		System.out.println("hi");
	
}
}
	}



