package randomnumber;
import java.util.Scanner;

public class Randomnumber {
	
int answer;
	
	int generateNumber(int min,int max) {
		
	 answer = (int) (Math.random()*(max-min+1)+min);
	return answer;
	
	}
	
	void FindNumber() {
	
        Scanner scan = new Scanner(System.in);
  
        int guess;
  
        boolean correct = false;
   
        while (!correct) {
  
            System.out.println(
                "Guess a number between 1 and 30: ");  
      
            guess = scan.nextInt();  
         
            if (guess > 30 || guess < 1) {
                System.out.println("Too high, try again");
                }  
          
            else if (guess < answer) {
                System.out.println("Too low, try again");
            }
            
            else {
  
                System.out.println(
                    "Yes, you guessed the number.");
  
                correct = true;
            }
        }
        System.exit(0);
    }
		
		
	}
	


