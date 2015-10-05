/*
 * Project: Driver.java
 * Description: He takes a trip in a car and fills up, checks gas levels
 * Name: Aaron Snowberger
 * Date: Oct 5, 2015
 */

public class Driver {
  
  public static void main( String[] args ) {
    
    // 24 mpg
    Car myBmw = new Car( 24 );
    
    // fillup 20 gallons
    myBmw.fillUp( 20 );
    
    // drive 100 miles
    myBmw.takeTrip( 100 );
    
    // report fuel left ( 15.833333333333332 )
    System.out.println( "You have " + myBmw.reportFuel() + " gallons left." );
    
    // Bragging method
    Car myTesla = new Car( 42, 20, "Tesla", "Model X", "white", 2016, 400, 3.2 );
    System.out.println( myTesla.bragOnYourCar() );
    
  } // end main method
  
} // end class