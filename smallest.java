
//LArgest Number
//Find the largest number in given array

//-infinity (intergers.min_value)
// +infinity (interger max_value)

// public class largestinarray {

//     public static int largest(int numbers[]){
//         int largest = Integer.MIN_VALUE; ///-infinity
//         for(int i =0;i<numbers.length; i++){
//             if(largest<numbers[i]){
//                 largest = numbers[i];
//             }
//         }
//         return largest;
//     }



//     ///main function

//     public static void main (String args[]){
//         int numbers[]={1,2,6,3,5};
//         System.out.println("largest Value" + largest(numbers));

//     }




// }


public class smallest {

    public static int smallest(int numbers[]){
        int smallestl = Integer.MAX_VALUE; ///-infinity
        for(int i =0;i<numbers.length; i++){
            if(smallestl>snumbers[i]){
                smallestl = numbers[i];
            }
            
        }
        return smallestl;
    }



    ///main function

    public static void main (String args[]){
        int numbers[]={0,1,2,6,3,5};
        System.out.println("Smallest Value" + smallest(numbers));

    }
}



