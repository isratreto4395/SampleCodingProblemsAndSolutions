package reverseString;

//create a method that will take in a string and reverse each letter so that it is completely backword.
public class ReverseString {
    public static void main(String[] args) {
        reverseWord("kowshik");
    }



    public static String reverseWord(String word){
        char[] letters = new char[word.length()];
        int letterIndex = 0;
        for(int i = word.length()-1; i>=0; i--){
            letters[letterIndex]=word.charAt(i);
            letterIndex++;
        }
        String reverse = "";
        for(int i =0;i<word.length();i++){
            reverse = reverse + letters[i];
        }
        System.out.println("Reverse Word : "+reverse);
        return reverse;
    }
}
