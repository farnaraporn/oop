package projectoop;

import java.util.Scanner;

public abstract class Phone {
   
   public abstract void show();
   public int am;
   public double am1;
   public double ais =100;
   public double dtac = 50;
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
        } else if (np1 == 567) {
            System.out.println("0844070204 DTAC ");
            System.out.println("ยอดค้างชำระรวม 1290 บาท");
            System.out.println("- เดือนที่ 1 600 บาท");
            System.out.println("- เดือนที่ 2 690 บาท");
            System.out.print("กรุณาใส่จำนวนเงินที่ต้องการชำระ : ");
            Scanner ch1 = new Scanner(System.in);
            double ch = ch1.nextDouble();

            if (ch == 600) {
                System.out.print("ยอดค้างชำระคงเหลือ 690 บาท");
            } else if (ch == 690) {
                System.out.print("ยอดค้างชำระคงเหลือ 600 บาท");
            } else if (ch == 1290) {
                System.out.print("ยอดค้างชำระคงเหลือ 0 บาท");
            }

        }

    }//เม็ด
    public void addmoney() {
        
        System.out.print("กรุณาใส่เบอร์ : ");
        Scanner a = new Scanner(System.in);
        am = a.nextInt();
           
        if(am == 369 ){
            
             System.out.println("369 AIS ");
             System.out.println("ยอดเงินคงเหลือ "+ais+"บาท");
        }else if (am == 147){
            
             System.out.println("147 DTAC ");
             System.out.println("ยอดเงินคงเหลือ "+dtac+"บาท");
        
        }
        
        System.out.println("กรุณาเลือกจำนวณเงิน");
        System.out.println("20");
        System.out.println("30");
        System.out.println("50");
        System.out.println("90");
        System.out.println("100");
        System.out.println("150");
        System.out.println("200");
        System.out.print("กรุณาใส่จำนวนเงินที่ต้องการ : ");
        Scanner a1 = new Scanner(System.in);
        am1 = a1.nextDouble();
      
        
    }
    
    
    
    
}//คลาส




