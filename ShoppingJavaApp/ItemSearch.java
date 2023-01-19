public class ItemSearch {

	public static float search(Product product,String membership,String date,String[][] priceList) {
		
		//Returning  consumer's date as day month and year to userdate array
		String[] userdate = date.split("[.]");
		int len1 = priceList.length;
		int day = Integer.parseInt(userdate[0]);
		int month = Integer.parseInt(userdate[1]);
		int year = Integer.parseInt(userdate[2]);
		
		//For loop to search the specific price according to priceList		
		for(int i=0;i<len1;i++) {
			//Getting startday ,month and year of pricelist elements
			String[] startdate = priceList[i][2].split("[.]");
			int startday = Integer.parseInt(startdate[0]);
			int startmonth = Integer.parseInt(startdate[1]);
			int startyear = Integer.parseInt(startdate[2]);
			//Getting endday ,month and year of pricelist elements
			String[] enddate = priceList[i][3].split("[.]");
			int endday = Integer.parseInt(enddate[0]);
			int endmonth = Integer.parseInt(enddate[1]);
			int endyear = Integer.parseInt(enddate[2]);
			
			//Checking whether productNames comply in priceList product name
			if(product.getProductName().equals(priceList[i][0])){
				//Checking membership comply
				if(membership.equals(priceList[i][1])) {
					//Checking if it is in the interval of that dates
					if(year>=startyear && year<=endyear && month>=startmonth && month<=endmonth && day>=startday && day<=endday) {
						//If all comply return price
						float price = Float.parseFloat(priceList[i][4]);
						return price;	
					}
				}							
			}
		}
		//If not return 0
		return 0;
	}

}
