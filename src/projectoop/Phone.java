package projectoop;

import java.util.Scanner;

public abstract class Phone {

    public void Enternumberphone() {

        System.out.print("กรุณาใส่เบอร์ : ");
        Scanner np = new Scanner(System.in);
        int np1 = np.nextInt();

        if (np1 == 123) {
            System.out.println("0620640330 TRUE-H ");
            System.out.println("ยอดค้างชำระรวม 990 บาท");
            System.out.println("- เดือนที่ 1 400 บาท");
            System.out.println("- เดือนที่ 2 590 บาท");
            System.out.print("กรุณาใส่จำนวนเงินที่ต้องการชำระ : ");
            Scanner ch1 = new Scanner(System.in);
            double ch = ch1.nextDouble();

            if (ch == 400) {
                System.out.print("ยอดค้างชำระคงเหลือ 590 บาท");
            } else if (ch == 590) {
                System.out.print("ยอดค้างชำระคงเหลือ 400 บาท");
            } else if (ch == 990) {
                System.out.print("ยอดค้างชำระคงเหลือ 0 บาท");
            }
        }else if (np1==567){
            System.out.println("0844070204 DTAC ");
            System.out.println("ยอดค้างชำระรวม 990 บาท");
            System.out.println("- เดือนที่ 1 400 บาท");
            System.out.println("- เดือนที่ 2 590 บาท");
            System.out.print("กรุณาใส่จำนวนเงินที่ต้องการชำระ : ");
            Scanner ch1 = new Scanner(System.in);
            double ch = ch1.nextDouble();

            if (ch == 400) {
                System.out.print("ยอดค้างชำระคงเหลือ 590 บาท");
            } else if (ch == 590) {
                System.out.print("ยอดค้างชำระคงเหลือ 400 บาท");
            } else if (ch == 990) {
                System.out.print("ยอดค้างชำระคงเหลือ 0 บาท");
            }
        
        
        }

       

    }

}

//คลาสลูก 1
//class monthly extends Phone{
//   public void calculate(){
// }
//}
//คลาสลูก 2 
//class money extends Phone {


//}
