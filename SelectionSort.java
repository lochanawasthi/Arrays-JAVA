public class SelectionSort {

    public static void main (String args[]){
        int numbers []= {5,4,1,3,2};

        SelectionSort(numbers);

        ///print
        // for( int number : numbers){
        // System.out.print(number);
        // }

        for(int i=0; i<numbers.length;i++){
            System.out.print(numbers[i]);
        }
       
    
    }
    public static void SelectionSort(int numbers[]) {

        //for dec
        for(int i = 0; i<numbers.length-1;i++){
            int fL = i;
            for(int j = i+1; j<numbers.length;j++){
                if(numbers[fL] <numbers[j]){
                    fL=j;
                }
            }   
            //swap

            int temp = numbers[fL];
            numbers[fL]= numbers[i];
            numbers[i] =temp;
        }

    }




    //    for(int i = 0; i<numbers.length-1;i++){
    //     int first = i;
    //     for(int j =i+1; j<numbers.length;j++){
    //         if(numbers[first]>numbers[j]){

    //             first=j;

    //         }
            
    //     }
    //     //swap
    //     int temp = numbers[first];
    //     numbers[first] = numbers[i];
    //     numbers[i] = temp;
    //    }
    // }
    
}
