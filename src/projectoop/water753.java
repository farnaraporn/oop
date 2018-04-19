

package projectoop;
import java.util.Scanner;
public abstract class water753 implements intowater {
    private double price = 0;
    private int wtEnd;
    private int wtStart;
    int sumwater = 0;
    
    public void pagewateruser() {
        System.out.println("==================================================");
        //public void intowater1() {System.out.printl("Water Bill Payment");}
        System.out.println("==================================================\n");
        
        System.out.println("--------------------------------------------------");
        System.out.println("????????????????????????????");
        
        System.out.print("??????????????? : ");
        Scanner waterStart = new Scanner(System.in);
        wtStart = waterStart.nextInt();
        
        System.out.print("????????????? : ");
        Scanner waterEnd = new Scanner(System.in);
        wtEnd = waterEnd.nextInt();
        System.out.println("--------------------------------------------------\n");
        
        
        
        
    }  
   
    
        public void SumMeterWater(){
                sumwater = wtEnd - wtStart;
                System.out.println("????????????????? ??? : " +sumwater+ " ?????");
        }
        
        public double price(){
            if(sumwater <=10){
                price = sumwater*10.20;
            }
            else if(sumwater <=20){
                price = sumwater*16;
            }
            else if(sumwater <=30){
                price = sumwater*19;
            }
            else{
                price = sumwater*21.20;
            }
            
            return price;
        }
}



    
    interface intowater {
         public void intowater1();
    }



