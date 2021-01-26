package findcurrentmethodname;

public class DisplayCurrentMethodName {
    public static void currentMethodName()
    {
        String nameofCurrentMethod = new Throwable().getStackTrace()[0].getMethodName();

        System.out.println("Name of current method: "
                + nameofCurrentMethod);
    }

    public static void main(String[] args)
    {
        currentMethodName();
    }
}

