import java.util.Scanner;

public class Main{

  public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    int number;

    System.out.println("Enter an integer value");
    number = input.nextInt();

    String final_answer = getName(number);

    System.out.println(final_answer);

  }

  public static String getName(int value){

    if (value > 0 && value <= 7)
    {
      if (value == 1){

        String day = "Sunday";
        return day;
      }

      else if (value == 2){
        
        String day = "Monday";
        return day;
      }

      else if (value == 3){

        String day = "Tuesday";
        return day;

      }

      else if (value == 4){

        String day = "Wednesday";
        return day;

      }

      else if (value == 5){

        String day = "Thursday";
        return day;

      }

      else if (value == 6){

        String day = "Friday";
        return day;
      }

      else{

        String day = "Saturday";
        return day;

      }

    }
    else {

      String invalid = "You have entered an invalid number.";

      return invalid;
    }
  }

}
