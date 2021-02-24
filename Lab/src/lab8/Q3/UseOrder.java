package lab8.Q3;
import java.util.Scanner;
import java.util.regex.Pattern;
public class UseOrder {
	public static void main(String args[]) 
	{	//order object
		Order order=new Order();
		Scanner scanner= new Scanner(System.in);
		String cname;int cid,qty,up;
		System.out.println("Enter Customer name:");
		cname=scanner.nextLine();
		System.out.println("Enter Customer Id:");
		cid=scanner.nextInt();
		System.out.println("Enter Item Quantity: ");
		qty=scanner.nextInt();
		System.out.println("Enter Item Unit Price: ");
		up=scanner.nextInt();
		order.setCustomerName(cname);order.setCustomerNumber(cid);order.setQty(qty);
		order.setUnitPrice(up);order.computePrice();
		System.out.println("\nOrder Total= "+order.getTotalprice());System.out.println();
		//shipped order object
		ShippedOrder shippedOrder=new ShippedOrder();
		System.out.print("Enter Customer name:");
		Pattern whitespace = Pattern.compile("\\s*");
		scanner.skip(whitespace);
		cname=scanner.nextLine();
		System.out.println("Enter Customer Id:");
		cid=scanner.nextInt();
		System.out.println("Enter Shipped Item Quantity: ");
		qty=scanner.nextInt();
		System.out.println("Enter Shipped Item Unit Price: ");
		up=scanner.nextInt();
		shippedOrder.setCustomerName(cname);shippedOrder.setCustomerNumber(cid);
		shippedOrder.setQty(qty);shippedOrder.setUnitPrice(up);
		shippedOrder.computePrice();
		System.out.println("\nOrder Total= "+shippedOrder.getTotalprice());scanner.close();
	}
}
