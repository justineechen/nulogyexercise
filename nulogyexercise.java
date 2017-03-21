import java.lang.Math;

public class nulogyexercise {
	/**
 *  Calculate the pricing
 */
	 public static double calculateMarkUp(double basePrice, int numPeople, String jobType){
	 	double material = 0;

	 	//When the material is food increment material by 13%
	 	if(jobType.equals("food")){
	 		material += 0.13;
	 	}

	 	//When material is pharmaceutical increment material by 7.5%
	 	else if(jobType.equals("drugs")){
	 		material += 0.075;
	 	}

	 	//When material is electronics increment material by 2%
	 	else if(jobType.equals("electronics")){
	 		material += 0.02;
	 	}

	 	//If material is anything else but the above it will stay at 0

	 	//Multiplying 1.2% by the amount of people working on the job
	 	//Material is added to the percentage if it falls into any of the above categories
	 	//100% is added to include the Base Price
	 	double markUp = (0.012 * numPeople)
	 				   + material 
	 				   + 1.0;


	 	//Multiplying the base price FIRST with the flat rate of 5%
	 	basePrice += basePrice * 0.05;

	 	//Multiplying the base price with the mark up price to produce result
	 	return basePrice * markUp;


	}
	public static void main(String[] args){
		//Taking each commandline argument separately
		String basePriceString = args[0];
		String numPeopleString = args[1];
		String jobType = args[2];

		//Casting the Base Price of to a double
		double basePrice = Double.parseDouble(basePriceString);

		//Casting the number of people to an int
		int numPeople = Integer.parseInt(numPeopleString);

		//Calling the calculating function and rounding the result to two decimal places	
		double unroundedResult = calculateMarkUp(basePrice, numPeople, jobType);
		double result = Math.round(unroundedResult * 100.0)/ 100.0;

		//Printing output for the user
		System.out.println("Marked up price:");
		System.out.println(result);
	}
}