
package projectoop;

import java.util.Scanner;
public class Projectoop {

   
    public static void main(String[] args) {
        int number;
        do{
        
        System.out.println("กด 1 ชำระบริการค่าน้ำ");
        System.out.println("กด 2 ชำระบริการค่าโทรสับ");
        Scanner n = new Scanner(System.in); 
        System.out.print("Enter number : ");
        number = n.nextInt();
    
        if(number==2){
        
        //สร้าง oj
        Enternumberphone ();
        
        }else{
        
        }
        
        
        
        }while(number!=1&&number!=2);  
           
    }
    
    
    
    
    
    
    
}
