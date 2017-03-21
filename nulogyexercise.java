
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
	 	double markUp = 0.05 
	 				   + (0.012 * numPeople)
	 				   + material 
	 				   + 1.0;
	 	return markUp * basePrice;

	}
	public static void main(String[] args){
		//Need to deal with commandline input to put into function
	// System.out.println(args[0]);
		double toPrint = calculateMarkUp(1299.99, 3, "food");
		System.out.println(toPrint);
}
}



