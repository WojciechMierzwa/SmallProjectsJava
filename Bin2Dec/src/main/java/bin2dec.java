import java.util.Scanner;
import java.lang.Math;

//https://github.com/florinpop17/app-ideas/blob/master/Projects/1-Beginner/Bin2Dec-App.md <- task

public class bin2dec {
    public static void main(String[] args){
        int binaryNumber;
        double decimalNumber=0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter binary number");
        binaryNumber= scan.nextInt();
        int length = String.valueOf(binaryNumber).length();
        for(int i=0; i<length; i++)
        {
            if(binaryNumber%2==1)
            {
                decimalNumber=Math.pow(2,i)+decimalNumber;
            }

            binaryNumber=binaryNumber/10;
        }
        System.out.println((int)decimalNumber);

    }
}
