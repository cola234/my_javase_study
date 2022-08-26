package test;

class A{
    public int a;
    public int b;
    public A(){
        System.out.println("A的构造方法");
    }
    static {
        System.out.println("A的静态代码块");
    }
    {
        System.out.println("A的实例代码块");
    }
}
class B extends A{
    public int c;
    public B(){
        System.out.println("B的构造方法");
    }
    static {
        System.out.println("B的静态代码块");
    }
    {
        System.out.println("B的实例代码块");
    }
}


public class testdemo2 {
    public static void main(String[] args) {
        B b = new B();
    }
}
