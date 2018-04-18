
package projectoop;
import java.util.Scanner;
public abstract class water implements intowater {
    public void pagewateruser() {
        System.out.println("==================================================");
        System.out.println(into);
        System.out.println("==================================================\n");
        
        System.out.println("--------------------------------------------------");
        System.out.println("กรุณากรอกรายละเอียดการใช้น้ำ");
        
        System.out.print("มิเตอร์เริ่มต้น : ");
        Scanner waterStart = new Scanner(System.in);
        int wtStart = waterStart.nextInt();
        
        System.out.print("มิเตอร์สิ้นสุด : ");
        Scanner waterEnd = new Scanner(System.in);
        int wtEnd = waterEnd.nextInt();
        System.out.println("--------------------------------------------------\n");
        
        int sumwater = 0;
        sumwater = wtEnd - wtStart;
        System.out.println("จำนวนหน่วยมิเตอร์ คือ : " +sumwater);
    }
    
}    
    
    interface intowater {
         public static String into = "Water Bill Payment"; 
    }

