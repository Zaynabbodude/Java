import java.util.Scanner;
public class Simpleif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        if (age<=5){
        System.out.println("Welcome to the FSC 723 game"); 
        }
        else{
        System.out.println("You are not qualified this game"+ "\nBye!!!");
        }

    }
}
