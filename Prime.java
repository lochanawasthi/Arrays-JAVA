
import java.util.*;

public class Prime{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num ==2){
           System.out.print(" num is Prime");

        }
        else{
            boolean isPrime = true;

            for(int i=2; i<=Math.sqrt(num); i++){
                    if(num%i==0){
                        isPrime = false;
                    }
            }

            if(isPrime == true){
                System.out.println("Prime");          }

            else{
              System.out.println("Not prime");
            }
        }
    }
}