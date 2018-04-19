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
                waterbill wb = new waterbill();
                wb.bill();
                
            } else {
                System.out.println("แบบรายเดือน กด 1");
                System.out.println("แบบเติมเงิน  กด 2 ");
                Scanner s = new Scanner(System.in);
                System.out.print("Enter number : ");
                select = s.nextInt();
                if(select==1){
                    monthlybill mbill = new monthlybill();
                    mbill.showmonthlybill();
                } else if(select==2){
                    money mn = new money();
                    mn.show();
                    mn.calculate();
                
                }
            }
            

        } while (number != 1 && number != 2);
       System.out.println("======================================================"); 
       Projectoop pp = new Projectoop();
       pp.membercus();
     
    }
    
     public void membercus() {
     String name = "fah";
        String pass = "1234";
        String name1;
        String pass1;

        String nameS = "sunya";
        String passS = "4567";
        String name1S = null;
        String pass1S = null;

        String namet = "Teacher";
        String passt = "7890";
        String name1t = null;
        String pass1t = null;

        System.out.println("คุณเป็นสมาชิกหรือไม");
        System.out.println("ถ้าเป็น กด 1");
        System.out.println("ถ้าไม่เป็น กด 2");
        System.out.print("กดหมายเลข : ");
        Scanner CT = new Scanner(System.in);
        int CT1 = CT.nextInt();

        if (CT1 == 1) {
            do {
                System.out.print("กรอกชื่อ : ");
                Scanner NC = new Scanner(System.in);
                name1 = NC.nextLine();

                System.out.print("กรอกรหัส : ");
                Scanner NP = new Scanner(System.in);
                pass1 = NP.nextLine();
            } while (!(name.equals(name1) && pass.equals(pass)) && (nameS.equals(name1S) && passS.equals(pass1S)) && (namet.equals(name1t) && passt.equals(pass1t)));
   
            
        } else if(CT1 == 2)  {
            
            Customer cus =new Customer();
            cus.member();
            
            
           
            
            
            
            
        }
     
     
     
     
     
     }
    
}
