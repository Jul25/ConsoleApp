import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class ConsoleApp {
    public static void main(String[] args) {
        checkTasks();
    }

    public static int[] getTicket() {
        Scanner tick = new Scanner(System.in);
        System.out.println("Input Ticket Number");
        String ticket = tick.nextLine();
        String[] numb = ticket.split("");
        int[] array = new int[numb.length];

        for (int i = 0; i < numb.length; ++i) {
            array[i] = Integer.parseInt(numb[i]);
        }
        return array;
    }

    static void checkTicket() {

        int[] ticket = getTicket();
        int sum1 = ticket[0] + ticket[1] + ticket[2];
        int sum2 = ticket[3] + ticket[4] + ticket[5];


        if (sum1 == sum2) {
            System.out.println("Happy One");
        } else {
            System.out.println("Not Today");
        }

    }

    public static double[] stringSplit() {
        Scanner Coefficient = new Scanner(System.in);
        System.out.println("Input Coefficients");
        String a = Coefficient.nextLine();
        String[] numb = a.split(" ");

        double[] array = new double[numb.length];

        for (int i = 0; i < 3; i++) {
            array[i] = Double.parseDouble(numb[i]);
        }
        return array;
    }

    public static double getDiscriminant(double a, double b, double c) {

        return b * b - 4 * a * c;
    }

    static void One_Root(double a, double b) {
        double x = (-1 * b) / (2 * a);
        System.out.println("One Solution:\n" + "x=" + x);
    }

    static void Two_Roots(double disc, double a, double b) {

        double x1 = (-b + sqrt(disc)) / (2 * a);
        double x2 = (-b - sqrt(disc)) / (2 * a);

        System.out.println("Two Solutions:\n" + "x1=" + x1 + ";x2=" + x2);

    }

    static void getFinalRoots() {
        System.out.println("Let's count a*x^2+b*x+c=0, please," +
                "input your A B C" +
                "correspondingly, separated by spaces");
        double[] coefs = stringSplit();
        double disc = getDiscriminant(coefs[0], coefs[1], coefs[2]);

        if (disc < 0) {
            System.out.println("No Solution");
        }
        if (disc == 0) {
            One_Root(coefs[0], coefs[1]);
        }

        if (disc > 0) {
            Two_Roots(disc, coefs[0], coefs[1]);
        }
    }

    public static long randomFunc() {

        return (long) (Math.random() * Math.pow(2, 31));
    }

    public static int[] numberSplit(long value) {
        String number = Long.toString(value);
        String[] numb = number.split("");
        return new int[numb.length];
    }

    static void countRandomLength() {
        int[] array = numberSplit(randomFunc());

        System.out.println(array.length);
    }

    public static long getSide() {
        Scanner sides = new Scanner(System.in);
        System.out.println("Input Side");
        return sides.nextLong();
    }

    static void countSize() {
        long side1 = getSide();
        long side2 = getSide();
        long size = side1 * side2;

        if (side1 == side2) {
            System.out.print("Square:");
            System.out.print(size);
        } else {
            System.out.print("Rectangle:");
            System.out.print(size);
        }
    }

    public static int getInput() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Input Number");
        int input = inp.nextInt();
        return input;
    }

    public static String getInput1() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Input Name");
        String input = inp.nextLine();
        return input;
    }

    public static String getInf(String[] ar) {
        String[] array = new String[ar.length];

        for (int i = 0; i < array.length; i++) {
            array[i] = ar[i];
        }

        return array[getInput() - 1];
    }

    public static int getInf1(String[] array) {
        String ar[] = new String[array.length];

        for (int i = 0; i < ar.length; i++) {
            ar[i] = array[i];
        }
        return Arrays.asList(ar).indexOf(getInput1()) + 1;

    }

    static void learnMonthInf() {
        String[] array = new String[]{"January", "February", "March", "April",
                "May", "June", "July", "August", "September", "October",
                "November", "December"};

        System.out.println(getInf(array) + " \n and \n" + getInf1(array));
    }


    static void playMonetka() {

        int n = (int) (Math.random() * 100) - 85;

        if (n < 0) {
            System.out.println("Heads");
        }

        if (n > 0) {
            System.out.println("Tails");
        }

        if (n == 0) {
            System.out.println("Rib");
        }

    }

    static void checkTasks() {
        while (true) {
            Scanner tasks = new Scanner(System.in);
            System.out.println("\nWanna check the tasks? Yes or No");
            String a = tasks.nextLine();
            if (a.equals("Yes")) {
                System.out.println("Here's yr menu,Cowboy:\n" +
                        "1 - Task 1 - Happy Tickets\n" +
                        "2 - Task 2 - Discrimination Ha-Ha\n" +
                        "3 - Task 3 - How many?\n" +
                        "4 - Task 4 - What's the Size?\n" +
                        "5 - Task 5 - Here we go again\n" +
                        "6 - Task 6 - Damned Months\n");
                checkTask();
            }
            if (a.equals("No")) {
                System.out.println("Wanna play a game with me? Ok ");
                playMonetka();
                System.out.println("Bye, dude. See u next time");
                break;

            } else {
                System.out.println("Go home, dude or try again");
            }
        }
    }

    static void checkTask() {
            Scanner task = new Scanner(System.in);
            System.out.println("Type in the chosen number from 1 to 6:");
            int a = task.nextInt();
            switch (a) {
                case 1:
                    checkTicket();
                    break;
                case 2:
                    getFinalRoots();
                    break;
                case 3:
                    countRandomLength();
                    break;
                case 4:
                    countSize();
                    break;
                case 5:
                    checkTasks();
                    break;
                case 6:
                    learnMonthInf();
                    break;
            }


        }


}

