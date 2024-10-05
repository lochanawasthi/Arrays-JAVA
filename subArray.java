public class subArray {


    public static void Sub (int numbers[]){
        int ts=0;
        for(int i =0; i<numbers.length; i++){


            for(int j =i; j<numbers.length; j++){


                for(int k=i; k<=j; k++){

                    System.out.print(numbers[k]+ " ");
                    
                }//final loops]
                ts++;
                System.out.println();

            }//2nd loop
                System.out.println();
        }//1st loop
        System.out.print("TOtal: =" + ts );
    }

    public static void main (String args[]){
        int numbers[]= {2,4,6,7,8};

        System.out.println("Number:");
        Sub(numbers);
        
        
    }

}
