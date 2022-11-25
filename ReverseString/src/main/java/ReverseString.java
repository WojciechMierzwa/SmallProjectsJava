
public class ReverseString {
    public static void main(String[] args){
        String result = reverse("java");
        if(result.equals("java"))
            System.out.println("Yes");
        else System.out.println("No");
    }

    public static String reverse(String word) {
        char[]  letters = new char[word.length()];
        String NotReversedWord="";
        for(int i=0; i<word.length(); i++)
        {
            letters[i]=word.charAt(word.length()-1-i);
        }
        String reversedWord="";
        for(int i=0; i<word.length(); i++)
        {
            reversedWord=reversedWord+letters[i];
        }

        return reversedWord;
    }
}
