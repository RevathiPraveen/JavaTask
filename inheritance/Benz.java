package inheritance;

public class Benz extends Maruti {
	
		Benz() {
			System.out.println("Class Benz");
		}

		void speed() {
			super.speed();
			System.out.println("Maximum speed:100Kmph");
		}
	}

