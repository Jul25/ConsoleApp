import java.util.Scanner;
public class task1 {
    public static int[] getTicket() {
        Scanner tick = new Scanner(System.in);
             System.out.println("Input Ticket Number");
        String ticket = tick.nextLine();
        String[] numb = ticket.split("");
        int [] array = new int[numb.length];

            for(int i = 0; i < numb.length; ++i) {
                 array[i] = Integer.parseInt(numb[i]);
        }

                return array;
    }
    static void checkTicket() {

        int [] ticket = getTicket();
        int sum1 = ticket[0] + ticket[1] + ticket[2];
        int sum2 = ticket[3] + ticket[4] + ticket[5];


                if (sum1 == sum2) {
                    System.out.println("Happy One");
        }           else {
                    System.out.println("Not Today");
        }

    }

    public static void main(String[] args) {
        checkTicket();

    }
}



