import static java.lang.Math.*;
public class Main {


    public static void main(String[] args) {
        countRandomLength();


    }
        public static long randomFunc() {

        return (long) (Math.random() * Math.pow(2, 31));
        }
            public static int [] numberSplit(long value) {
                String number = Long.toString(value);
                String [] numb = number.split("");
                 int  array [] = new int [numb.length];
                return array;
            }
    static void countRandomLength() {
        int [] array = numberSplit(randomFunc());

        System.out.println(array.length);
    }









}