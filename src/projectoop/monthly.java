
package projectoop;

import java.util.Scanner;

public class monthly extends Phone implements showphone {
    monthly() {
       System.out.println("----------------------"); 
    }
    
    public  void show(){    
    System.out.println("ยินดีให้บริการ");
    System.out.println("==============================");
    }
    public void sphone(){
    super.Enternumberphone();
    this.show();
        }    
}

