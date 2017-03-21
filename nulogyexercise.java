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
	// System.out.println(args[0]);
		double toPrint = calculateMarkUp(1299.99, 3, "food");
		double rounded = Math.round(toPrint * 100.0) / 100.0;
		System.out.println(rounded);
	}
}