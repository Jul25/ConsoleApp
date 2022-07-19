import java.util.Scanner;
import java.util.Arrays;

public class task6 {

    public static int getInput() {

            Scanner inp = new Scanner(System.in);
            System.out.println("Input Month");
            int input = inp.nextInt();
            return input;
        }

    public static String getInput1() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Input Month");
        String input = inp.nextLine();
        return input;
    }




        public static String getInf (String[]ar){
            String[] array = new String[ar.length];
            for (int i = 0; i < array.length; i++) {
                array[i] = ar[i];
            }

            return array[getInput() - 1];
        }
        public static int getInf1 (String[]array){
            String ar[] = new String[array.length];
            for (int i = 0; i < ar.length; i++) {
                ar[i] = array[i];
            }
            return Arrays.asList(ar).indexOf(getInput1()) + 1;

        }
        static void learnMonthInf () {
            String[] array = new String[]{"January", "February", "March", "April",
                    "May", "June", "July", "August", "September", "October",
                    "November", "December"};

            if (true) {
                System.out.println(getInf(array));

            } else if (true) {
                System.out.println(getInf1(array));

            }
        }

        public static void main (String[]args){
            learnMonthInf();
        }

    }





