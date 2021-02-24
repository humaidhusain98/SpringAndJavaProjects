package Lab5.Question2;

public class VirtualWorldManager {
	public static void main(String args[]) {
		Person person=new Person("PERSON");
		System.out.print(person.getName());
		person.forward(1);
		
		
		Auto auto=new Auto();
		auto.honk("AUTO");
		auto.backward(1);
		auto.honk("AUTO");
		
		Bicycle bicycle=new Bicycle();
		bicycle.backward(5);
		
	}
	
	
}
