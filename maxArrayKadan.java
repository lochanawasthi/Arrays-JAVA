public class maxArrayKadan {
    public static void main (String args[]){
        int numbers[] = {2,-3,-4,5,-6,7,8,-10,6};
    }

    public static void kandanMax(int numbers[]){
        int curr = 0;
        int max = Integer.MIN_VALUE;

        for(int i =0; i<numbers.length; i++){

            curr = curr +numbers[i];

            if(curr<0){
                curr=0;
            }
            max = Math.max(curr,max);

        }
    }
}
