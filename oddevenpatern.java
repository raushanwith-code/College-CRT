public class oddevenpatern {

    public static void main(String[] args) {

        System.out.println("Enter a Number");
        
        for(int i=0; i<=4; i++){

            for(int j=0; j<=4; j++){

                if((i+j)%2==0){

                    System.out.print(0+" ");
                }else{

                    System.out.print(1+" ");
                    
                }
            }
            System.out.println();
        }
         
    }
    
}
