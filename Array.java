import java.util.*;

public class Array{
   
    public static void update(int marks[]){
        for (int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
   
    public static void main(String args[])
    {

        int marks[]={22,22,33,33};
        update(marks);

        //Print our marks
        for (int i=0;i<marks.length;i++){
            System.out.println(marks[i]+"");
        }
        System.out.println();
        // int marks[]=new int [100];

        // Scanner sc = new Scanner(System.in);
        // //int phy;
        // //phy = sc.next.int();
        // System.out.println("Write 1.");
        // marks[0]=sc.nextInt();//phy
        // marks[1]=sc.nextInt();//chem
        // marks[2]=sc.nextInt();//math
  
        // System.out.println("Phsy: "+marks[0]);
        // System.out.println("Phsy: "+marks[1]);
        // System.out.println("Phsy: "+marks[2]);
  
  
    }
}