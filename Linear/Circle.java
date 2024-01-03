import java.util.Scanner;
public class Circle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius of circle: ");
        float r = input.nextFloat();
        double aRea = Math.PI* r * r;
        double cIrcum = 2* Math.PI * r;
        System.out.println("The Area of the circle is " + aRea);
        System.out.println("The Circumference of the circle is  " + cIrcum);    

    }
    
}
