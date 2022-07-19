import java.util.Arrays;
import java.util.Scanner;


public class Try {
    public static void keepTicket() {

        Scanner tick = new Scanner(System.in);
        System.out.println("Input Ticket Number");
        String ticket = tick.nextLine();

        String[] numb = ticket.split("");
        int[] array = new int[numb.length];

        for (int i = 0; i < numb.length; ++i) {
            array[i] = Integer.parseInt(numb[i]);
        }

        System.out.println(Arrays.toString(array));
        tick.close();
    }

    public static void main(String[] args) {

        while (true) {
            try {
                keepTicket();
             break;

            } catch (NumberFormatException ex) {
                System.out.println("Please, type only integer value");

            }

        }


    }
}
