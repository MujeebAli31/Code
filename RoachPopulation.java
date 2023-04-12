
public class RoachPopulation {
		int aR;
		int bR;
		double breedR;
		double sprayR;
		double roach;
public RoachPopulation(int roachAmount) {
	roach=roachAmount;
	System.out.println("The Initial Roach population is "+ (int)roach);
}
public void getRoach() {
	System.out.println("The Roach population after cycle " +aR+" breeding is " + (int)breedR*2);
	System.out.println("The Roach population after cycle " +aR+" at "+bR+" percent spraying is "+ (int)sprayR);
}
public void insecticide(int spray) {
	bR=spray;
	roach-=((spray*.01)*(roach));
	roach=Math.round(roach);
	sprayR=roach;
}
public void breed() {
	breedR=roach;
	roach*=2;
	aR++;

	
	
	
		
		

	
}

}
