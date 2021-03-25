package reverseString;

public class Shortcut {

    public static void main(String[] args) {

        String s = "Israt Reto";
        StringBuffer e = new StringBuffer(s);// stringBuffer is a peer class of string that provides much of the functionality of strings
        System.out.println(e.reverse());
    }

}
