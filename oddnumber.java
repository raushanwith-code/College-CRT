import java.util.*;
public class oddnumber {

    public static void main(String[] args) {

        int sum=0;

        Scanner Sc= new Scanner(System.in);

        System.out.println("Enter a number");

        int n=Sc.nextInt();
        
        for(int i=0; i<=n; i++){

            if(i%2!=0){

                sum +=i;

            }
        }
        System.out.println("sum is :"+sum);
    }
    
}
