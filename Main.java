import java.util.Scanner;

/**
 *
 * @nick 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user input
  Scanner input = new Scanner(System.in);

 // ask the user for the pizza size in cm
 System.out.println("What is the size of the pizza in cm:");
  
 // declare and initialize a variable for the pizza
double diameter = input.nextDouble();

// labour for pizza
final double labour = .75;

// power for oven
final double power = .99;


// taxes of pizza
final double tax = diameter * .13;

// price for ingredients
final double ingredients = diameter * .5;

if(diameter >= 1 && diameter <= 20){
double subtotal = (diameter * .5 + power + labour);
System.out.println("Subtotal " + subtotal);
System.out.println("Taxes " + tax);
System.out.println("Total " + subtotal + tax);
System.out.println("We are going to make you a cute little pizza!");
} else 
if(diameter >= 20 && diameter <= 40){
double subtotal = (diameter * .5 + power + labour);
System.out.println("Subtotal " + subtotal);
System.out.println("Taxes " + tax);
System.out.println("Total " + subtotal + tax);
System.out.println("This will be delicious!");
} else 
if(diameter > 40){
double subtotal = (diameter * .5 + power + labour);
System.out.println("Subtotal " + subtotal);
System.out.println("Taxes " + tax);
System.out.println("Total " + subtotal + tax);
System.out.println("Whoa, big pizza! You might need a truck to get this home!");
}  
  }
}
