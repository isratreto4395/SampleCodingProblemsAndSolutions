package convertingMinutesPlusHoursToSeconds;

public class MainMethod {
    public static void main(String[] args) {


        System.out.println("Problem: convert minutes into seconds");

        Convert con = new Convert();
        System.out.println(con.convert1(1));

        System.out.println(con.convert2(1.5));
    }
}