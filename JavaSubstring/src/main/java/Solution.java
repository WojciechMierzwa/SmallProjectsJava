import java.io.*;
import java.util.*;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        largest=s.substring(0,k);
        int length = s.length();
        smallest=s.substring(length-k,length);

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        if(s.length()>1000 || s.length()<k)
            ;
        else
        {
            System.out.println(getSmallestAndLargest(s, k));
        }
        scan.close();


    }
}