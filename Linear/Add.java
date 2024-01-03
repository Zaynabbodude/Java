import java.util.scanner;
public class Add {
        public static void main(String[]args){
            Scanner scanner = new Scanner(System.in);
            int count = 0;
            int sum = 0;
            System.out.println("Enter the termination point;n");
            int n = scanner.nextInt;
            for (int i=1; i<=n; i++){
                sum = sum +1;
            }
            double mean = sum/n;
            System.out.println("sum="+sum);
            System.out.println("mean=" +mean);
        }
    }    
