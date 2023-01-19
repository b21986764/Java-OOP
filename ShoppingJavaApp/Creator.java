public class Creator {

	public static Consumer[] consumerCreator(String[] consumers) {
		

		//Creating a new Consumer class array with same length of consumers
		int len = consumers.length;
		Consumer[] allConsumers = new Consumer[len];
		
		for(int i = 0;i<len;i++) {
			
			//Consumer array as name-surname, membership , product , and number 
			String[] consumer = consumers[i].split("\t");

			//Product array with a length of ( consumer - 3 ) /2
			Product[] products = new Product[(consumer.length-3)/2];


			//Extracting name , surname , memebership and dates from consumer array
			String name = consumer[0].split(" ")[0];
			String surname = consumer[0].split(" ")[1];
			String membership = consumer[1];
			String date = consumer[2];

			//Define a for loop to get product name and number of purcahases for each consumer
			int h = 0;
			for(int j = 3;j<consumer.length;j+=2) {
				String productName;
				int numPurchases;
				
				productName = consumer[j];
				numPurchases = Integer.parseInt(consumer[j+1]);
				Product p = new Product(productName,numPurchases);
				products[h] = p;
				
				h++;
			}
			//Adding consumers to allConsumer class Array
			Consumer c = new Consumer(name,surname,membership,date,products);
			allConsumers[i] = c;
				
		}
		return allConsumers;
	}
	
	//Mehod to transform priceList lines to Multidimensional array with separate elements
	public static String[][] productPrices(String[] pricelist){
		

		int len = pricelist.length;
		String[][] prices = new String[len][];
		
		for(int i = 0;i<len;i++) {
			String[] product;
			product = pricelist[i].split("\t");
			prices[i]=product;
		}
		return prices;
	}

	
}
