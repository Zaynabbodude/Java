import java.util.Scanner;
    public class Age{
        /**
         * @param args
         */
        public static void main(String[] args) {
                    Scanner input = new Scanner(System.in);
                System.out.println("Enter your age: " );
                int age = input.nextInt();
                System.out.println("Enter current year: " );
                int year = input.nextInt();
                int yearBorn = year - age ;
                System.out.println("You were born in the year: " + yearBorn);
            }
    }
