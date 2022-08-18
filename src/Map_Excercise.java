import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Map_Excercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		Map<String, String> forSale = new HashMap<>();
		
		forSale.put("Focus", "Ford");
		forSale.put("Mustang", "Ford");
		forSale.put("Escape", "Ford");
		forSale.put("Explorer", "Ford");
		forSale.put("Bronco", "Ford");
		forSale.put("Ranger", "Ford");
		forSale.put("F-150", "Ford");
		forSale.put("GT", "Ford");
		forSale.put("Spark", "Chevy");
		forSale.put("Bolt", "Chevy");
		forSale.put("Malibu", "Chevy");
		forSale.put("Trailblazer", "Chevy");
		forSale.put("Equinox", "Chevy");
		forSale.put("Tahoe", "Chevy");
		forSale.put("Traverse", "Chevy");
		forSale.put("Suburban", "Chevy");
		forSale.put("Colorado", "Chevy");
		forSale.put("Silverado", "Chevy");
		forSale.put("Camaro", "Chevy");
		forSale.put("Corvette", "Chevy");
		forSale.put("Ram", "Dodge");
		forSale.put("Charger", "Dodge");
		forSale.put("Challenger", "Dodge");
		forSale.put("Durango", "Dodge");
		forSale.put("Civic", "Honda");
		forSale.put("Insight", "Honda");
		forSale.put("Accord", "Honda");
		forSale.put("Odyssey", "Honda");
		forSale.put("Ridgeline", "Honda");
		forSale.put("HR-V", "Honda");
		forSale.put("CR-V", "Honda");
		forSale.put("Pilot", "Honda");
		
		System.out.println("What vehicle are you looking for?");
		
		String shoppingFor = input.nextLine();
		
		if (forSale.containsKey(shoppingFor)) {
			System.out.printf("Great, if you're looking for a %s, I've got just the thing! Follow me, our collection of %s models is just this way!", shoppingFor, forSale.get(shoppingFor));
		}
		
		else {
			System.out.printf("Hmm, well I'm not sure if we have a %s available. How about we take a look around? I'm sure we can find something to suit your needs.", shoppingFor);
		}	
	}

}
