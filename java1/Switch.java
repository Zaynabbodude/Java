import java.util.Scanner;
public class Arithmetic{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println(" Welcome the program computer Arithmetic of two numbers \n Enter 1 for Addition \n 2 for Multiplication \n 3 for Division \n 4 for Subtraction \n 5 to Exit");
        System.out.println("Enter the two numbers ");
        float n1 = input.nextFloat();
        float n2 = input.nextFloat();
        int choice = input.nextInt();
        switch(choice) {
          case 1:
            System.out.println("You have chosen addition");
            float add = n1 + n2;
            System.out.println("sum=" +add);
            break;
          case 2:
            System.out.println("You have chosen multiplication");
            float multiplication = n1*n2;
            System.out.println("the product =" + multiplication);
            break;
          case 3:
            System.out.println("You have chosen division");
            double division = n1/n2;
            System.out.println("Division=" + division);
            break;
          case 4:
             System.out.println("You have chosen subtraction");     
             float subtraction = n1 - n2;
             System.out.println("Subtrsction=" + subtraction);
             break;
          case 5:
             System.out.println("You have chosen to exit");
             System.out.println("Bye");
             break;
        }
    }
}