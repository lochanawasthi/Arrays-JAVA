public class subArray {


    public static void Sub (int numbers[]){

        for(int i =0; i<numbers.length; i++){


            for(int j =i; j<numbers.length; j++){


                for(int k=i; k<j; k++){

                    System.out.println(numbers[k]+ "");
                }//final loops
                System.out.println();

            }//2nd loop
                System.out.println();
        }//1st loop
        
    }

    public static void main (String args[]){
        int numbers[]= {2,4,6,7,8};

        System.err.println("Number" + Sub());
    }

}
