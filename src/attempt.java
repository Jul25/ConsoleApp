import java.util.Arrays;
import java.util.Scanner;


public class attempt {
    private static boolean isInt(String s)
            throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


            public static void main (String[]args) {
                if (isInt("l;j")) {
                    System.out.println("good");
                }
                    else {
                    System.out.println("bad");
                }
            }

        }