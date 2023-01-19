public class Consumer {
	
	//Private fields
	private String consumerName;
	private String consumerSurName;
	private String memberShip;
	private String date;
	private Product[] boughtProducts;
	
	//Public constructor of Consumer class
	public Consumer(String name,String surname,String membership,String date,Product[] products){
		this.consumerName = name;
		this.consumerSurName = surname;
		this.memberShip = membership;
		this.date = date;
		this.boughtProducts = products;
		
	}
	
	//Getters and setters to access and modify fields
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Product[] getProducts() {
		return this.boughtProducts;
	}
	public void setProducts(Product[] products) {
		this.boughtProducts = products;
	}
	public String getConsumerName() {
		return consumerName;
	}
	public void setConsumerName(String consumerName) {
		this.consumerName = consumerName;
	}
	public String getConsumerSurName() {
		return consumerSurName;
	}
	public void setConsumerSurName(String consumerSurName) {
		this.consumerSurName = consumerSurName;
	}
	public String getMemberShip() {
		return memberShip;
	}
	public void setMemberShip(String memberShip) {
		this.memberShip = memberShip;
	}
	

}
