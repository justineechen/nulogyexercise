import java.lang.Math;

public class nulogyexercise {
	/**
 *  Calculate the pricing
 */
	 public static double calculateMarkUp(double basePrice, int numPeople, String jobType){
	 	double material = 0;
	 	if(jobType == "food"){
	 		material += 0.13;
	 	}

	 	else if(jobType == "drugs"){
	 		material += 0.075;
	 	}

	 	else if(jobType == "electronics"){
	 		material += 0.02;
	 	}
	 	double markUp = (0.012 * numPeople)
	 				   + material 
	 				   + 1.0;
	 	basePrice += basePrice * 0.05;
	 	return basePrice * markUp;


	}
	public static void main(String[] args){
		//Need to deal with commandline input to put into function
		//Input: PRICE INT STRING

		String basePriceString = args[0];
		String numPeopleString = args[1];
		String jobType = args[2];

		double basePrice = Double.parseDouble(basePriceString);
		int numPeople = Integer.parseInt(numPeopleString);

		System.out.println(basePrice);
		System.out.println(numPeople);
		System.out.println(jobType);

		double test = 1299.99;
		int test2 = 3;
		String test3 = "food";

		double result = calculateMarkUp(test,test2,test3);	
		double roundedResult = Math.round(result * 100.0)/100.0;

		System.out.println("Hardcoded result:");
		System.out.println(roundedResult);

		double result2 = calculateMarkUp(basePrice, numPeople, jobType);
		double roundedresult2 = Math.round(result2 * 100.0)/ 100.0;

		System.out.println("Commandline result:");
		System.out.println(roundedresult2);
	}
}