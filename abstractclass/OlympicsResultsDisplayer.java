package abstractclass;

public class OlympicsResultsDisplayer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Athlete oAthlete;
		oAthlete = new NeerajChopra();
		oAthlete.eat();
		oAthlete.sleep();
		oAthlete.event();
		oAthlete.accomplishment();
		oAthlete = new RaviKumar();
		oAthlete.event();
		oAthlete.accomplishment();
		oAthlete = new PVSindhu();
		oAthlete.event();
		oAthlete.accomplishment();
	}

}
