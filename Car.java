/*
 * Class: Car.java
 */

public class Car {
  
  double mpg;     // how many miles/gallon
  double gallons; // how many gallons in the tank
  String color      = "";
  String make       = "";
  String model      = "";
  int year          = 0;
  double horsepower = 0;
  double zts        = 0;
  
  /*
   * Note on Arrays
   * 
   * array MyArray = [ mpg, gallons, color, make, model, year, horsepower, zts ];
   * Car myAudi = new Car( MyArray );
   */
  
  // 20 liters in the tank
  // 25 km/liter
  // whole tank = 500 km
  
  public Car( double milespg ) {
    
    this.mpg = milespg;
    this.gallons = 0;
    
  } // end constructor method
  
  
  public Car( double mpg, double gal, String make, String model, String color, int year, double hp, double zts ) {
    
    this.mpg        = mpg;
    this.gallons    = gal;
    this.make       = make;
    this.model      = model;
    this.color      = color;
    this.year       = year;
    this.horsepower = hp;
    this.zts        = zts;
    
  } // end OVERloaded constructor
  
  
  public void fillUp( double fill ) {
    
    // fillUp() adds gas to the tank
    this.gallons += fill;
  
  }
  
  
  public void takeTrip( double miles ) {
    
    // removes gallons from the tank based on number of miles
    // traveled 100 km (param)
    // how many liters to subtract from our tank using kmpl
    double gallonsToSubtract = miles / mpg;
    this.gallons -= gallonsToSubtract;
    
  }
  
  
  public double reportFuel() {
   
    // tells how much gas is left
    return gallons;
    
  }
  
  
  public String bragOnYourCar() {
    
    String output = "";
    output += "Dude, I just bought this sweet ";
    output += color + " " + year + " " + make + " " + model + "! ";
    output += "It has " + horsepower + " horsepower, ";
    output += "gets " + mpg + " miles per gallon, ";
    output += "and has a " + gallons + " gallon gas tank! ";
    output += "And it goes from zero to sixty in " + zts + " seconds! ";
    output += "It's the greatest car I've ever owned!";
    
    return output;
    
  }
  
} // end class