import java.util.Scanner;
public class Quadratic {
    private static String num1;

    public static void main(String[] args){
            Scanner input = new Scanner(System.in);
        System.out.println("The value of a is: ");
        float a = input.nextFloat();
        System.out.println("The value of b is: ");
        float b = input.nextFloat();
        System.out.println("The value of c is: ");
        float c = input.nextFloat();
        double d = b * b - (4.0*a*c);
        
        if (d<0){
            System.out.println("Roots are complex");
        } 
        else if (d>0){
            System.out.println("Only one root exists with ");
            double num = -b/(2*a);
        }
        else {
            double num1 = ((-b) + Math.sqrt(d)) / (2 * a);
            double num2 = ((-b) - Math.sqrt(d)) / (2 * a);
        }

        System.out.println("Two real roots exists with values are " + num1 + num2);
        
    }
}