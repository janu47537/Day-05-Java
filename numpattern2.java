/*
5
5 4 3 2 1 
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
*/
import java.util.*;
public class numpattern2{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=5;i>=1;i--)
        {
            for(int j=5;j>=1;j--)
            {
                System.out.print(j+" ");
            }
System.out.println();
        }
    }
}