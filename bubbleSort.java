public class bubbleSort {
            

        public static void bubbleSort(int numbers[]){

///////for dec order
            for(int i=0; i<numbers.length-1; i++){
                for(int j=0; j<numbers.length-1-i; j++){
                    if(numbers[j]<numbers[j+1]){
                        //swap
                        int temp = numbers[j];
                        numbers[j] = numbers[j+1];
                        numbers[j+1]= temp;
                    }
                }
            }


            // for(int turn = 0; turn<numbers.length-1;turn++){
            //         for(int j=0; j<numbers.length-1-turn;j++){
            //             if(numbers[j]>numbers[j+1]){ ///TO MAKE IT IN DECINDING ORDER CHANGE THE SIGH > TO <

            //                 //swap
            //                 int temp = numbers[j];
            //                 numbers[j] = numbers[j+1];
            //                 numbers[j+1] = temp;


            //             }
            //         }
            // }
        }

       
        public static void main (String args[]){
            int numbers[] = {5,6,2,3,4,1};

            bubbleSort(numbers);
           //print sorted arr
           for (int a=0; a<numbers.length;a++){
            System.out.print(numbers[a]+"");
           }

        }
}
