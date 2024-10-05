import java.util.ArrayList;



import java.util.List;

public class OOPS {
        public static void main(String[] args) {

        // ArrayList<ArrayList<Integer>>MainList = new ArrayList<>();
        // ArrayList<Integer>List1 = new ArrayList<>();
        // ArrayList<Integer>List2 = new ArrayList<>();
        // ArrayList<Integer>List3 = new ArrayList<>();

        //     for(int i=1; i<=5; i++){
        //         List1.add(i*1);
        //         List2.add(i*2);
        //         List3.add(i*3);

        //     }

        // MainList.add(List1);
        // MainList.add(List2);
        // MainList.add(List3);

        // System.out.println(MainList);
            // int arr [] = {1,3,5,6};

            // ArrayList <Integer> list = new ArrayList<>();
            // // int target = 5;
            // list.add(1);
            // list.add(8);
            // list.add(6);
            // list.add(2);
            // list.add(5);
            // list.add(4);
            // list.add(8);
            // list.add(3);
            // list.add(7);
            // // System.out.println(Pairs(list, target));
            // System.out.println(Max(list));

            ArrayList<Integer> list = new ArrayList<>();
             int target = 16;
            list.add(11);
            list.add(15);
            list.add(6);
            list.add(8);
            list.add(9);
            list.add(10);
           
            System.out.println(Pairs2(list,target));


            
            

        }



public static void sort(int arr[]){
    for(int i = 0; i<arr.length-1; i++){
        for(int j= 0; j<arr.length-1-i; j++){
            if(arr[j]> arr[j+1]){

                //swap
                int temp = arr[j];
                arr[j] = arr[j+1];
            arr[j+1] = temp;           
        }
        }
    }
}


public static boolean Pairs(ArrayList<Integer> list , int target){

int rp =  list.size()-1;
int lp = 0;


while(lp<rp){

    if(list.get(lp) + list.get(rp) == target){
        return true;
    }

    if(list.get(lp)+list.get(rp) < target){
        lp++;
    }
    else{
        rp--;
    }

}
return false;


}

public static int Max(ArrayList<Integer>list){


int maxWater = 0;
int lp =0;
int rp = list.size()-1;

while(lp<rp){
     int ht = Math.min(list.get(lp), list.get(rp));
    int width = rp-lp;
    int currWat = width * ht;
    maxWater = Math.max(maxWater, currWat);
    
        //update ptr
        if(list.get(lp)< list.get(rp)){
            lp++;
        }
        else{
            rp--;
        }
}

return maxWater;

}

public static boolean Pairs2(ArrayList<Integer>list, int target){

    int n = list.size(); //array size
    int bp =-1; //assigning break point
    for(int i=0; i<list.size();i++){ //Defining Break Point..
        if(list.get(i)> list.get(i+1)){
            bp=i;
            break;
        }
    }


    int lp = bp+1; //smallest
    int rp = bp; //largest

    while(lp != rp){ //if lp == rp target true

        //case1
        if(list.get(lp) + list.get(rp) == target){
            return true;
        }

        //case2
        if(list.get(lp) + list.get(rp) < target){
            lp = (lp+1)% n;
        }

        //case3
        else{
            if(list.get(lp) + list.get(rp) > target){
                rp = (rp+n-1)% n;
        }
    }

  

    }
    return false;
}


}