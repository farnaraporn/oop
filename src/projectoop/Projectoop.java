package projectoop;

import java.util.Scanner;

public class Projectoop {

    public static void main(String[] args) {
        int number;
        int select;
        do {

            System.out.println("กด 1 ชำระบริการค่าน้ำ");
            System.out.println("กด 2 ชำระบริการค่าโทรสับ");
            Scanner n = new Scanner(System.in);
            System.out.print("Enter number : ");
            number = n.nextInt();

            if (number == 1) {

                
            } else {
                System.out.println("แบบรายเดือน กด 1");
                System.out.println("แบบเติมเงิน  กด 2 ");
                Scanner s = new Scanner(System.in);
                System.out.print("Enter number : ");
                select = s.nextInt();
                
                Phone p = new Phone() {
                };
                p.Enternumberphone();
            }

        } while (number != 1 && number != 2);

    }

}
