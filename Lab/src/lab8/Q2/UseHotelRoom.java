package lab8.Q2;

public class UseHotelRoom{

public static void main(String args[]) {


HotelRoom hotelroom1=new HotelRoom(200);
System.out.println("Nightly Rental with Hotel Room number less than 299="+hotelroom1.getNightlyRental()) ;

HotelRoom hotelroom2=new HotelRoom(300);
System.out.println("Nightly Rental with Hotel Room number greater than or equal to 300="+hotelroom2.getNightlyRental()) ;

Suite suite1=new Suite(200);
System.out.println("Nightly Rental for Suite with Room number less than 299="+suite1.getNightlyRental()) ;

Suite suite2=new Suite(300);
System.out.println("Nightly Rental for Suite with Room number greater than or equal to 300="+suite2.getNightlyRental()) ;



}//end of main


}//end of class