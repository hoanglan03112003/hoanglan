package baitap2;

public class sachkhamthao extends sach {
    private double thue, thanhTien;
 
    public sachkhamthao() {
        super();
    }
 
    public sachkhamthao(double thue) {
        super();
        this.thue = thue;
    }
 
    public double getThue() {
        return thue;
    }
 
    public void setThue(double thue) {
        this.thue = thue;
    }
 
    public void nhapSach() {
        super.nhapSach();
        System.out.print("Nhập thuế: ");
        thue = sc.nextDouble();
    }
     
    @Override
    public String toString() {
        return super.toString() + ", thuế: " + this.thue;
    }
}
