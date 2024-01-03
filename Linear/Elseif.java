import java.util.Scanner;
public class Elseif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*System.out.println("Enter Score for each Grade point");
        int score = input.nextInt();
        int gp;
        if (score==70){
            gp = 5;
        }
        else if (score >= 60){
            gp = 4;
        }
        else if (score >= 50){
            gp = 3;
        }
        else if (score >= 45){
            gp = 2;
        }
        else if (score >= 40){
            gp = 1;
        }
        else {
            gp = 0;
        }
        System.out.println("Grade point is: " + gp); */

        System.out.println("Enter unit price P: ");
        double unitP = input.nextDouble();
        System.out.println("Enter quantity of items bought : ");
        int quantT = input.nextInt();

        double grossPay = unitP * quantT;
        System.out.println("The Grosspay before dicount is " + grossPay);

        double discT;
        if (quantT>=21){
            discT = 0.08 * unitP;
        }
        else if(quantT<=20){
            discT = 0.06 * unitP;
        }
        else if(quantT<=10){
            discT = 0.04 * unitP;
        }
        else{
            discT = 0.02 * unitP;
        }
        System.out.println("The discount given is " + discT);

        double netP = grossPay - discT;
        System.out.println("The netpay after discount is " + netP);
    }   
}
