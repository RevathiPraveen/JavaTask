package reversenumber;
import java.util.Scanner;

public class Coderunnerreversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reversenumber object = new Reversenumber();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to be reversed");
		int number = scan.nextInt();
		
		object.reverseNumber(number);
	}

}
