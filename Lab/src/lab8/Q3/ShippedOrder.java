package lab8.Q3;

public class ShippedOrder extends Order{
	private int totalprice;	
	@Override
	void computePrice() 
	{	
		totalprice=getQty()*getUnitPrice()+4;
	}
	@Override
	public int getTotalprice()
	{
		return totalprice;
	}
	

}
