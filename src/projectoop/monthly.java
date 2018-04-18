
package projectoop;

public class monthly extends Phone implements showphone {
    monthly() {
        
    }
    
    public  void show(){    
     System.out.println("======ยินดีให้บริการ========");
    
    }
    public void sphone(){
    super.Enternumberphone();
    this.show();
        }    
}

