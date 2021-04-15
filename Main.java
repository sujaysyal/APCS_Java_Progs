import java.util.ArrayList;
import java.util.Scanner;

public class Main{

  public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    int a; 
    int b; 
    int c; 

    System.out.println("\nWelcome to SujaySolves.com!\n\nToday we are going to be solving quadratic equations.\n\nThe standard form of a quadratic equation is ax^2 + bx + c = 0. \n");

    System.out.println("Enter the \"a\" value of any quadratic equation as an integer: ");
    a = input.nextInt();

    System.out.println("Enter the \"b\" integer value of the same quadratic equation you used earlier: ");
    b = input.nextInt();

    System.out.println("Finally, enter the \"c\" integer value of the quadratic equation: ");
    c = input.nextInt();

    double discriminant = discFormula(a,b,c);

    System.out.println("\nHere is the discriminant " + discriminant);

    if (discriminant > 0){

      System.out.println("\nThe quadratic has two real solutions.");
    }

    else if (discriminant == 0){

      System.out.println("\nThe quadratic has exactly one solution");

    } 
    
    else {

      System.out.println("\nThe quadratic has no real solutions and only imaginary solutions.");

    }

    System.out.println("\nType 1 if you want to see the solutions and 0 if you don't want to see the solutions.");

    int Response2 = input.nextInt();

    if (Response2 == 1)
    {

      if (discriminant >= 0)
      {

        double Solution1 = ((-1* b) + (Math.sqrt(discriminant)))/ (2 * a);
        double Solution2 = ((-1* b) - (Math.sqrt(discriminant)))/ (2 * a );

        System.out.println("Here are your solutions:\n x = " + Solution1 + "\n x = " + Solution2);
      
      }

    }
    else 
    {
      System.out.println("Have fun solving quadratics yourself!");
    }

  }

  public static double discFormula(int A, int B, int C){

      double Discriminant = Math.pow(B,2) - (4 * A * C);
      return Discriminant;

  }
}
