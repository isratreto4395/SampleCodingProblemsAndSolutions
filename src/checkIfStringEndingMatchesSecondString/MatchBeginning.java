package checkIfStringEndingMatchesSecondString;

public class MatchBeginning {

    public static boolean matchingBeginningString(String name1, String name2) {
        if (name1.startsWith(name2)) {
            return true;
        } else {
            return false;
        }
    }
}
