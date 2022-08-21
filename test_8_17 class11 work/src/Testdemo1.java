
class WashMachine {
    public String brand; // 品牌
    public String type; // 型号

    public void set(String brand,String type) {
        this.brand = brand;
        this.type = type;
    }

    public void information() {
        System.out.println(brand+" "+type);
    }
}
public class Testdemo1 {
    public static void main(String[] args) {
        WashMachine ws = new WashMachine();
        ws.set("a","b");
        ws.information();
//        ws.information();
    }
}
