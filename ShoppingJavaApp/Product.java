public class Product {
	
	//Private fields
	private String productName;
	private int numPurchases;
	
	//Constructor for Product class
	public Product(String name,int number) {
		this.productName = name;
		this.numPurchases = number;
	}
	
	//Getters and setters to access and modify fields
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getNumPurchases() {
		return numPurchases;
	}
	public void setNumPurchases(int numPurchases) {
		this.numPurchases = numPurchases;
	}
	
	
	

}
