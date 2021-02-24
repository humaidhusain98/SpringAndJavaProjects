import java.math.BigInteger;

public class competitive {
	
	public static void main(String args[]){
//		
		BigInteger big =new BigInteger("126622662566525252566");
		big= big.add(new BigInteger("100")).multiply(new BigInteger("100"));
		System.out.println(big);
		
		StringBuffer str=new StringBuffer("Intial One");
		str.append("Hello Bro").append("Another Operation").append("\n Another One!!");
		str.append("\n");
		str.append(big.toString());
		System.out.println(str);
		
		
		
		
	}

}
