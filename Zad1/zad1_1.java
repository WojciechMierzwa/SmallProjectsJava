import java.io.*;
import java.util.*;



public class zad1 {

    static String reverse(String a)
    {
        int length=a.length();
        String swap="";
        char temp;
        for(int i=length-1; i>=0; i--)
        {
            temp=a.charAt(i);
            swap=swap+temp;
        }
        return swap;
    }

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int number =scan.nextInt();
        scan.close();
        int temp = number;
        String binary="";
        String ebit="";
        String hbit="";
        //binary
        while(temp>0)
        {
            binary = binary+(temp%2);
            temp = temp/2;
        }

        //8-bit binary
        temp=number;
        while(temp>0)
        {
            ebit = ebit + (temp%8);
            temp = temp/8;
        }

        //16-bit binary
        temp=number;
        int temp1;
        while(temp>0)
        {
            temp1 = temp % 16;
            switch (temp1)
            {
                case 10:
                    hbit=hbit+'A';
                    break;
                case 11:
                    hbit=hbit+'B';
                    break;
                case 12:
                    hbit=hbit+'C';
                    break;
                case 13:
                    hbit=hbit+'D';
                    break;
                case 14:
                    hbit=hbit+'E';
                    break;
                case 15:
                    hbit=hbit+'F';
                    break;
                default:
                    hbit=hbit+temp1;
            }
            temp = temp / 16;
        }

        System.out.println("Binary equals: " + reverse(binary));
        System.out.println("Octal equals: " + reverse(ebit));
        System.out.println("Hexadecimal equals: " + reverse(hbit));

    }

}
