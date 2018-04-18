package projectoop;

public class money extends Phone {

    double totala;
    double totald;

    public void show() {
        System.out.println("======แบบเติมเงิน========");
        super.addmoney();
        
    }

    public void calculate() {

        if (super.am == 369) {

            totala = super.ais + super.am1;
            System.out.println("ยอดคงเหลือของหมายเลข" + super.am);
            System.out.println("เท่ากับ" + totala + "บาท");
        } else if (super.am == 147) {
            totald = super.dtac + super.am1;
            System.out.println("ยอดคงเหลือของหมายเลข" + super.am);
            System.out.println("เท่ากับ" + totald + "บาท");
        }
    }

}
