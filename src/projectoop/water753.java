

package projectoop;
import java.util.Scanner;
public abstract class water753 implements intoWater {
 
    private double price = 0;
    private int wtEnd;
    private int wtStart;
    int sumwater = 0;
    
    
    public void intowater1() {
        System.out.println("==================================================");
        System.out.println("================Water Bill Payment================");
        System.out.println("==================================================\n");
    }
    
    public void pagewateruser() {
   
        System.out.println("---------------------------------------------------");
        System.out.println("-------------------Pay Your Bill-------------------");
        System.out.println("---------------------------------------------------");
        System.out.println("Enter Detail!! ");
        
        System.out.print("Enter Start Meter : ");
        Scanner waterStart = new Scanner(System.in);
        wtStart = waterStart.nextInt();
        
        System.out.print("Enter End Meter : ");
        Scanner waterEnd = new Scanner(System.in);
        wtEnd = waterEnd.nextInt();
        System.out.println("--------------------------------------------------\n");
        
        
        this.SumMeterWater();
        
        System.out.print("Water Price = " +price);
        this.price();
        
    }  
   
    
        public void SumMeterWater(){
                sumwater = wtEnd - wtStart;
                System.out.println("Total Meter : " +sumwater+ " Unit");
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



    
    


