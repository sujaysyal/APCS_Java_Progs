import java.util.Scanner;

public class Main{

  public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    int num_1;
    int num_2;

    System.out.println("Enter a number: ");
    num_1 = input.nextInt();
    System.out.println("Enter another number: ");
    num_2 = input.nextInt();

    int answer = isBigger(num_1, num_2);
    System.out.println(answer);

  }

  public static int isBigger(int num1, int num2){


    if (num1 > num2){

      return num1;

    }

    else if (num1 == num2) {

      return num1;

    }

    else{

      return num2;

    }

  }

}
