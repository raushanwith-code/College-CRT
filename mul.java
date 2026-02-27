import java.util.*;
public class mul {

    public static void main(String[] args) {

        System.out.println("Enter a number");
        
      Scanner Sc=new Scanner(System.in);
      int x=Sc.nextInt();
      int y=Sc.nextInt();
      int z=Sc.nextInt();

        
        if(x > y && x > z) 
            System.out.println("Greater number is: " + x);
        else if(y > z && y > x) 
            System.out.println("Greater number is: " + y);
        else 
            System.out.println("Greater number is: " + z);

       
        if(x < y && x < z) 
            System.out.println("Smallest number is: " + x);
        else if(y < z && y < x) 
            System.out.println("Smallest number is: " + y);
        else 
            System.out.println("Smallest number is: " + z);
    }
}