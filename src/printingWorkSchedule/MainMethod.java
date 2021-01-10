package printingWorkSchedule;

public class MainMethod {
    public static void main(String[] args) {


        System.out.println("Problem: user should get no work if input saturday and sunday, the rest should be working day");
        //without while loop

       // WorkSchedule work = new WorkSchedule();
       // work.userInput();


        // with while loop

        WorkScheduleUsingWhileLoop work1 = new WorkScheduleUsingWhileLoop();
        work1.userInput();
    }
}