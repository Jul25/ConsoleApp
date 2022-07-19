import static java.lang.Math.*;
import java.util.Scanner;

public class task2 {
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


    public static void main(String[] args) {

        getFinalRoots();
    }
}