
public class ReverseString {
    public static void main(String[] args){
        String result = reverse("kajak jest kupa");
        System.out.println(result);
    }

    public static String reverse(String word) {
        char[]  letters = new char[word.length()];
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
