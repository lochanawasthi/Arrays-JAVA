

public class practice {

    public static boolean Sorted(int arr[], int i){       

        if( i == arr.length){
            return true;
        }

        if(arr[i] > arr[i+1]){
            return false;
        }

       return Sorted(arr, i+1);


    }

    public static int Fibonacci(int n){

        if(n==0 || n==1){
            return n;
        }

        int fnm1 = Fibonacci(n-1);
        int fnm2 = Fibonacci(n-2);
        int fn= fnm1 + fnm2;

        return fn;

    }


    public static int FirstOcc(int arrr[], int key,int i){
       
        if(i == arrr.length){
            return -1;
        }

        if( arrr[i] == key){
            return i;
        }
       
        return FirstOcc(arrr,key, i+1);


    }

   

    public static int LaastOcc(int arrr[], int key,int i){
       
        if(i == arrr.length){
            return -1;
        }

       int isFound = LaastOcc(arrr,key,i+1);

       if(isFound == -1 && arrr[i] == key){
         return i;
       }
       
        return isFound;


    }

public static void printBinStrings(int n, int lastPlace, String str) {
    // Base case
    
    if(n==0){
        System.out.println(str);
        return;
    }


    // Add '1'in any case 
    printBinStrings(n-1, 1, str + "1");

    // Add '0' only if the last place was not '0'
    if( lastPlace != 0){
        
        printBinStrings(n-1, 0, str + "0");
    }
    
}

    public static void main (String args[]){
        // int arr[] = {1,2,3,4,5};
        // System.out.println(Sorted(arr, 0));

        // int n= 5000;
        // System.out.println(Fibonacci(n));

        // int arrr[] = {8,3,6,9,5,10,2,5,3};
        // int arrr[] = {5,5,5,5,5};
        // System.out.println(LaastOcc(arrr,5,0));

        printBinStrings(3, 1, "");
        // ll(3.9,51,2);
    }





    }
