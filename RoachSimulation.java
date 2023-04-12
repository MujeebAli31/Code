
public class RoachSimulation {

	public static void main(String[] args) {
		RoachPopulation bugs=new RoachPopulation(10);
		bugs.breed();
		bugs.insecticide(50);
		bugs.getRoach();
		bugs.breed();
		bugs.insecticide(60);
		bugs.getRoach();
		bugs.breed();
		bugs.insecticide(70);
		bugs.getRoach();
		bugs.breed();
		bugs.insecticide(80);
		bugs.getRoach();




	}

}
