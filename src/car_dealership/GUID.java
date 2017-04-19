package car_dealership;
import java.util.Random;

public class GUID {
	
	Random rand = new Random();
	
	public int generateId(){
		int id = rand.nextInt(1000000000);
		return id;
	}
	

}
