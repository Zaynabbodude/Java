import java.util.Scanner;
     public class Average {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your name");
            String name = scanner.next();
            System.out.println("Enter value for a");
            float a = scanner.nextFloat();
            System.out.println("Enter value for b");
            float b = scanner.nextFloat();
            System.out.println("Enter value for c");
            double c = scanner.nextDouble();

            double sum = a + b + c;
            double avg = sum/3.0;

            System.out.println("Hello" + name + " , ");
            System.out.println("The average of the three numbers is " + avg + "\nBye");
        }
     }