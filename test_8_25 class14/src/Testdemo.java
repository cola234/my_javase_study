/*
抽象类 使用abstract修饰的类
 */


interface Ishape{
    //接口也可以发生向上转型
    int size = 10;//默认都用public static final修饰 必须初始化 不管加或不加

    public abstract void draw();//只能有抽象的方法
    default public void draw1(){//加default可以使用具体的方法
        System.out.println("Ishaop::draw1");
    }
    public static void func(){//静态方法也可以存在
        System.out.println("Ishape::func");
    }
}


class A implements Ishape{
    @Override//只能重写抽象方法 静态方法不能被重写 抽象方法必须被重写 实例方法可以重写可以不重写
    public void draw() {
        System.out.println("重写1");
    }

    @Override
    public void draw1() {
        System.out.println("可重写可不重写");
    }
}

abstract class Shap{
    private int a ;
    public abstract void draw();//用abstract修饰的方法不需要有具体实现方法
}

  public class Testdemo {
    public static void main(String[] args) {
        A a = new A();
        a.draw();
        a.draw1();

    }
}
