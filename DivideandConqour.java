public class DivideandConqour{

    public static void print(int arr[]){

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + "" );
        }
        System.out.println();

    }  
    
    public static void main(String args[]){
        // int arr[] = {6,3,9,8,2,5};
        int arr[] = {4,5,6,7,0,1,2};
        int target =0;
        // quickSort(arr,0,arr.length-1);
       System.out.println(search(arr, target, 0 , arr.length-1)); 
        print(arr);
    }
    
    public static int search(int arr[],int target, int si, int ei){
        //base case
        if(si>ei){
            return -1;
        }

        //midcase
        int mid = si + (ei-si)/2;

        //case to find mid as target
        if(arr[mid] == target){
            return mid;
        }

        //Now for line 1 left and right
        if(arr[si]<=arr[mid]){
            //case a
            if(arr[si]<= target && target <= arr[mid]){
                return search(arr, target, si, mid);
            }
            //case b
            else
            {
                return search(arr, target, mid + 1, ei);
            }

        }
        //Line 2 left or right
        else{
            //case a : right part

            if(arr[mid]<=target && target <= arr[ei]){
                //case a: right tera
                return search(arr, target, mid+1, ei);
            }

            //case b : left
            else{
                return search(arr, target, si, mid-1);
            }
        }
    }
    // public static void quickSort(int arr[], int si, int ei){

    //     //base case
    //     if(si>=ei){
    //         return;
    //     }

    //     ////last element
    //     int pIdx = partition(arr,si,ei);

    //     //for left side
    //     quickSort(arr, si, pIdx-1);

    //     //for right
    //     quickSort(arr, pIdx+1, ei);

    // }

    // public static int partition(int arr[], int si, int ei){

    //         int pviot = arr[ei];
    //         int i = si-1; // tomake place for els smaller than pivot


    //         for(int j=si; j<ei ;j++){

    //             //for left
    //             if(arr[j] <= pviot){
    //                 i++;
    //                 //swap
    //                 int temp = arr[j];
    //                 arr[j] =arr[i];
    //                 arr[i] = temp;


    //             }
    //         }
    //         i++;
    //         //swap for pivoit
    //         int temp = pviot;
    //         arr[ei] = arr[i];
    //         arr[i] = temp;
    //         return i;


    // }
    

  
}
