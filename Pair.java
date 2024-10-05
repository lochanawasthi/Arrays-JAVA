public class Pair {

public static void paris(int numbers[])
{
    for(int i =0; i<numbers.length; i++)
        {
            int curr =numbers[i];//2468

                for(int j =i+1; j<numbers.length; j++)
                    {
                    System.out.print("("+ curr +","+numbers[j]+")");
                    }//1st for
                        System.out.println();
        }//2ndr

}
    public static void main (String args[]){

        int numbers[]={2,4,6,8,10};
        paris(numbers);
    }
}

