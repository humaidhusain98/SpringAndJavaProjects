package lab8.Q3;
public class Order {
	 private String CustomerName;
	 private int CustomerNumber;
	 private int Qty,unitPrice;
	 private int totalprice;
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public int getCustomerNumber() {
		return CustomerNumber;
	}
	public void setCustomerNumber(int customerNumber) {
		CustomerNumber = customerNumber;
	}
	public int getQty() {
		return Qty;
	}
	public void setQty(int qty) {
		Qty = qty;
	}
	public int getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	public int getTotalprice() {
		return totalprice;
	}
	void computePrice() 
	{
		this.totalprice=Qty*unitPrice;	
	} 
}
