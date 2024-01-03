import java.util.Scanner;
public class Arithmetic {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
        int m = 25;
        int n = 7;
        int sum = m + n;
        double div = m / n;
        int multi = m * n;
        int sub = m -n ; 
        System.out.println("Sum of m and n is " + sum + "\nDivision of m by n is " + div + "\nMultiplication of m and n is " + multi + "\nSubtraction of n from m is " + sub );
     
        String x = "You";
        String y = "are";
        String z = "too big";
        System.out.println(x);
        System.out.print(y);
        System.out.println();
        System.out.println(z);
    }
}    
