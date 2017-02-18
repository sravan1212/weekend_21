
class Vehicle {
    public void move () {
         System.out.println ("Vehicles are used for moving from one place to another ");
    }
    
    
}

class Car extends Vehicle {
   
	public void move () {

      super. move (); // invokes the super class method
      System.out.println ("Car is a good medium of transport ");
    }
}

public class TestCar_methodoverriding extends Car{
  
	public void move () {

	      super. move (); // invokes the super class method
	      System.out.println ("Carghgfhgfhgfhgfhis a good medium of transport ");
	    }
	
	
	public static void main (String args [])
    {
        Car b = new TestCar_methodoverriding(); // Vehicle reference but Car object
     
        b.move (); //Calls the method in Car class
    }
}











