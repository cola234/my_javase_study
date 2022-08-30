package Test;


abstract class Shape {

    protected double area; // 普通成员变量
    public int a;
    private int b;

    public static int c;//静态成员变量

    //代码块
    static {
        ;
    }

    {
        ;
    }

    //构造方法
    public Shape(int a,int b){
        this.a = a;
        this.b = b;
    }

    //静态方法
    public static void func1(){
        System.out.println("static::func1");
    }

    //抽象方法
    public abstract void func2();

    //普通方法
    private double getArea(){
        return area;
    }

}

public class test2 {
    public static void main(String[] args) {

    }
}
