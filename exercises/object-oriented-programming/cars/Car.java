// Create a class called `Car` (and declare instance fields for 'Car class')
    private class Car {

        String make;
        String model;
        String colour;
        int year;
   
 // Create constructor method for 'Car' class with args: make, model, colour, year
    public Car(String make, String model, String colour, int year) {
       this.make = make;
       this.model = model;
       this.colour = colour;
       this.year = year;
    }

    // Create getter method for MAKE of Car class
       public String getMake() {
       }

     // Create getter method for MODEL of Car class
        public String getModel() {
       }

    // Create getter method for YEAR of Car class
       public int getYear() {
       }

    // Create setter method for COLOUR of Car class
    public void setColour() {

    } 
    // Returns the car details, including the make, model, colour and year from the 'Car' class
    public String getDetails() {
        String details = String.format("The make and model of car is %s and %s. The year of the car is %s. The colour of the car is %s.",  
this.make, this.model, this.year, this.colour
        );
        return details;
}
       

  }





