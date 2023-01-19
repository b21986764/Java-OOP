public class Main {

	public static void main(String[] args) {

		//Taking arrays from method readFile
		String[] shoppingLines =ReadFromFile.readFile(args[0]);
		String[] priceLines =ReadFromFile.readFile(args[1]);

		/*
		Sending line arrays to creator class to create consumer and product objects
		Then pricing class to calclulate and print the output
		*/
		Pricing.calculatePrices(Creator.consumerCreator(shoppingLines), Creator.productPrices(priceLines));
		
	}

}
