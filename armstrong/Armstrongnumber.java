package armstrong;

public class Armstrongnumber {
	
	
	void printArmstrongnumber(int number) {
		int value = number ,sum = 0,rem;
		
		while(number!=0) {
			
			rem=number%10;
			sum=sum+(rem*rem*rem);
			number=number/10;
			
		}
		if(value==sum)
			System.out.print(value + " ");
		
		}
	void run() {
		 {
			 for(int charindex = 1; charindex<=500; charindex++)
			printArmstrongnumber(charindex);
		}
	}

}
