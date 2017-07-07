import java.util.*;
import java.io.*;
public class NumberReverse 
{
 
    public int reverseNumber(int n){
         
        int reverse = 0;
        while(n != 0){
            reverse = (reverse*10)+(n%10);
            n = n/10;
        }
        return reverse;
    }
     
     public static void main(String a[]){
        NumberReverse nr = new NumberReverse();
        System.out.println("Result: "+nr.reverseNumber(29702));
    }
}
