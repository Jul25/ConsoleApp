

import java.util.Scanner;
 public class task4
    {
        public static long getSide() {
            Scanner sides = new Scanner(System.in);
            System.out.println("Input Side");
            long side = sides.nextLong();
            return side;
        }
            static void countSize() {
                long side1 = getSide();
                long side2 = getSide();
                long size = side1 * side2;

                if (side1 == side2) {
                    System.out.print("Square:");
                    System.out.print(size);
                }
                else {
                    System.out.print("Rectangle:");
                    System.out.print(size);
                }
            }


        public static void main(String[] args) {
            countSize();

                }

            }



