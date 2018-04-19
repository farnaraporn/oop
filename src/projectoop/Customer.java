package projectoop;

import java.util.Scanner;

public class Customer extends monthlybill {

    public void member() {
        
        String name = "fah";
        String pass = "1234";
        String name1;
        String pass1;
        
        String nameS = "sunya";
        String passS = "4567";
        String name1S = null ;
        String pass1S = null ;
        
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
            do{
            System.out.print("กรอกชื่อ : ");
            Scanner NC = new Scanner(System.in);
            name1 = NC.nextLine();
            
            System.out.print("กรอกรหัส : ");
            Scanner NP = new Scanner(System.in);
            pass1 = NP.nextLine();
            }while(!(name.equals(name1)&&pass.equals(pass))&&(nameS.equals(name1S)&&passS.equals(pass1S))&&(namet.equals(name1t)&&passt.equals(pass1t)));
           
        } else {
           
   }

        
        
        
        
    }

}
