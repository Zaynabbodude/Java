import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
                    Scanner input = new Scanner(System.in);

                /*System.out.println("This program computes the arithmetic number" + "\nEnter 1 for Addition \nEnter 2 for Subtraction \nEnter 3 for Multiplication \nEnter 4 for Division \nEnter 5 to Exit " );

                int choice = input.nextInt();
                System.out.println(" ");
                switch(choice){

                    case 1: System.out.println("Addition");
                    System.out.println("Enter the first numbers: ");
                    float a = input.nextFloat();
                    System.out.println("Enter the second numbers: ");
                    float b = input.nextFloat();
                    float add = a + b;
                    System.out.println("The value for the addition is " + add);
                    break;
                
                    case 2: System.out.println("Subtraction");
                    System.out.println("Enter the first numbers: ");
                    float c = input.nextFloat();
                    System.out.println("Enter the second numbers: ");
                    float d = input.nextFloat();
                    float sub = c - d;
                    System.out.println("The value for the subtraction is " + sub);
                    break;

                    case 3: System.out.println("Multiplication");
                    System.out.println("Enter the first numbers: ");
                    float e = input.nextFloat();
                    System.out.println("Enter the second numbers: ");
                    float f = input.nextFloat();
                    float multi = e * f;
                    System.out.println("The value for the multiplication is " + multi);
                    break;

                    case 4: System.out.println("Division"); 
                    System.out.println("Enter the first numbers: ");
                    float g = input.nextFloat();
                    System.out.println("Enter the second numbers: ");
                    float h = input.nextFloat();
                    float div = g / h;
                    System.out.println("The value for the division is " + div);
                    break;

                    case 5: System.out.println("Exit");
                }
                System.out.println("Program to compute value of month, 1-12" + "\nEnter the number: ");
            
                int option = input.nextInt();
                System.out.println();
                switch (option){
                    case 1: System.out.println("January"); break;
                    case 2: System.out.println("February"); break;
                    case 3: System.out.println("March"); break;
                    case 4: System.out.println("April"); break;
                    case 5: System.out.println("May"); break;
                    case 6: System.out.println("June"); break;
                    case 7: System.out.println("July"); break;
                    case 8: System.out.println("August"); break;
                    case 9: System.out.println("September"); break;
                    case 10: System.out.println("October"); break;
                    case 11: System.out.println("November"); break;
                    case 12: System.out.println("December"); break;
                    default: System.out.println("Hey, that is not valid"); break;
                }
        /*System.out.println("Enter a character: ");
        String character = input.next();    
        char charac = character.charAt(0);
        System.out.println("");
        switch (charac) {
        case 'a': System.out.println("character is a");break;
        case 'b': System.out.println("character is b");break;
        case 'c': System.out.println("character is c");break;
        case 'd': System.out.println("character is d");break;
        case 'e': System.out.println("character is e");break;
            default: System.out.println("character entered is out of range");
        }*/
         System.out.println("Program to read if a character is a vowel, consonant or not an alphabet");
         System.out.println("");
         String character = input.next();
         char charac = character.charAt(0);
         switch(charac){
            case 'a':
             System.out.println("Character is a ");
             System.out.println(" Character is a vowel");
             break;
            case 'e': 
             System.out.println("Character is e ");
             System.out.println(" Character is a vowel");
             break;
            case 'i': 
             System.out.println("Character is i ");
             System.out.println(" Character is a vowel");
             break;
            case 'o': 
             System.out.println("Character is o ");
             System.out.println(" Character is a vowel");
             break;
            case 'u': 
             System.out.println("Character is u ");
             System.out.println(" Character is a vowel");
             break;
            default: System.out.println("Character is not a vowel" + "\nOther alphabets are consonants. Good luck! ");
         }
     }
}

