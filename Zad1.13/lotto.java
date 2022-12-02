import java.util.*;

public class MagicSquare {

    public static void main(String args[])
    {
       ArrayList lotto = new ArrayList<Integer>();
       ArrayList results = new ArrayList<Integer>();
       Random rand = new Random();
        int temp=0;

        for(int i=0; i<49; i++)
        {
            lotto.add(i+1);
        }
        for(int i=0; i<6; i++)
        {
            temp= rand.nextInt()%(49-i);
            if(temp<0)
                temp=-temp;
            results.add(lotto.get(temp));
            lotto.remove(temp);
        }
        for(int i=0; i<6; i++)
        {
            System.out.println(results.get(i));
        }
        
    }
}
