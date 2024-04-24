// import java.util.*;
// public class linear {
    
//     public static int linearSearch(int numbers[],int key){
//             for(int i=0;i<numbers.length;i++)
//             {
//                 if(numbers[i]==key){
//                     return i;
//                 }  
                
//             }
//             return -1;
//     }

//     public static void main(String args[])
//     {
//         int numbers[]={2,4,6,8,10,12,14,16};
//         int key = 10;
//         int index  = linearSearch(numbers,key);

//         if(index ==-1){
//             System.out.println("Not FOund");
//         }
//             else
//             {
//                 System.out.println("Key is at index - "+ index);
//             }
//         }
//     }

import java.util.*;

public class linear{
    public static int linear(int num[],int key){
        for(int i=0; i<num.length;i++){
            if(num[i]==key){
                return i;
            }
        }
        return -1;


    }
    public static void main(String args[]){
        int num[]={2,3,4,6,7,8,9,9,0};
        int key = 4;
        int index =linear(num,key);
            if( index== -1){
                System.err.println("Not FOund");

            }
            else{
                System.out.println("FOun : "+ index);
            }
        }
}