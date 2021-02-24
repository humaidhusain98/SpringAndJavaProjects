package LabExamQ1;

public class Item {
	private String id;
	private String description=null;
	private double weight=-1.0;
	private int unitprice=-1;
	private int quantity=-1;
	private double price=-1.0;
	



	public String getId() {
		return id;
	}




	public void setId(String id) {
		this.id = id;
	}




	public String getDescription() {
		return description;
	}




	public void setDescription(String description) {
		this.description = description;
	}




	public double getWeight() {
		return weight;
	}




	public void setWeight(double weight) {
		this.weight = weight;
	}




	public int getUnitprice() {
		return unitprice;
	}




	public void setUnitprice(int unitprice) {
		this.unitprice = unitprice;
	}




	public int getQuantity() {
		return quantity;
	}




	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}




	public double getPrice() {
		return price;
	}




	public void setPrice(double price) {
		this.price = price;
	}




	public Item() {
		description=null;
		weight=-1.0;
		unitprice=-1;
		 quantity=-1;
		 price=-1;
		
	}
	
	
	
	
	public void getData(String id,String des,int up,int qty)//Electrical Appliances and Snacks
	{	this.id=id;
		description=des;
		unitprice=up;
		quantity=qty;
		price=quantity*unitprice;
		
	}
	
	public void getData(String id,String des,double wt,int up)//Fruit and Vegetable Items
	{	this.id=id;
		description=des;
		weight=wt;
		unitprice=up;
		price=weight*unitprice;
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
