public class Pricing {
	//Method to write required output
	public static void calculatePrices(Consumer[] consumers,String[][] priceList) {

		int len = consumers.length;
		String output = "";

		//First for loop to get name ,surname and products
		for(int i = 0;i<len;i++) {
			output+="---"+consumers[i].getConsumerName()+" "+consumers[i].getConsumerSurName()+"---\n";
			int len2 = consumers[i].getProducts().length;
			double totalamount = 0;
			Product[] products =  consumers[i].getProducts();

			//Second for loop to calculate productprice ,amount and sum total amount
			for(int j = 0;j<len2;j++) {
				float productprice = ItemSearch.search(products[j],consumers[i].getMemberShip(),consumers[i].getDate(),priceList);
				double amount = productprice*products[j].getNumPurchases();
				amount =  Math.round (amount*10)/10.0;
				totalamount+=amount;
				output+=products[j].getProductName()+"\t"+productprice+"\t"+products[j].getNumPurchases()+"\t"+amount+"\n";	
			}
			output+="Total\t"+totalamount+"\n";
		}
		System.out.println(output);	
	}
}
