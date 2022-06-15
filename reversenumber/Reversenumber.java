package reversenumber;

public class Reversenumber {
	void reverseNumber(int number) {
		int reverse = 0;  
		while(number != 0)   
		{  
			int remainder = number % 10;//1234//3//2/1
			reverse = reverse * 10 + remainder;//4//43//432  //4321
			number = number/10;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);  
		}  

}
