/*
A B C D E 
A B C D E
A B C D E
A B C D E
A B C D E
*/
import java.util.*;
public class printalphabetpattern{
    public static void main(String[]args){
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }
}