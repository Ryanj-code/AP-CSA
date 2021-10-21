public class car{

  //fields
  private String make;
  private int year;
  private double mpg;
  private double gasTank;
  private double gasLevel;
  private double odometer;
  private boolean on;

  public car(String make, int year, double mpg, double gasTank){
    this.make = make;
    this.year = year;
    this.mpg = mpg;
    this.on = false;
    this.gasTank = gasTank;
    this.gasLevel = gasTank;
    this.odometer = 0;
  }

  public String toString(){
    return("Your " + year + " " + make + " has traveled " + odometer +  " miles");
  }

  public void turnOn(){
    on = true;
  }

  public void turnOff(){
    on = false;
  }

  public void drive(int distance){
    if (this.on) {
      odometer += distance;        
        if (gasLevel - distance / this.mpg > 0){
          gasLevel -= distance / mpg;
        }    
        else{
          System.out.println("Not enough fuel");
        }
      }
    else{
      System.out.println("The car is not on.");
    }
  }

  public void fillUp(){
    this.gasLevel = gasTank;
  }
}
