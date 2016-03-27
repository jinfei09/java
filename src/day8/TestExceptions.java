package day8;

/**
 * Created by arika on 16/3/16.
 */
public class TestExceptions {

    private static void doRisky(String test) {
        System.out.println("Start risky");

        if ("yes".equals(test)) {
            try {
                throw new ScaryException();
            } catch (ScaryException e) {
                e.printStackTrace();
            }
        }
        System.out.println("end risky");
        return;
    }

    public static void main(String[] args) {
        String test = "no";
        try {
            System.out.println("start try");
            doRisky(test);
            System.out.println("end try");
        } finally {
            System.out.println("finally");

        }
    }
}
