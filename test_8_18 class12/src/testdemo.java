class OuterClass{//外部类
    private int data1;
    public void fun1(){
        System.out.println("fun1");
    }
    class InnerClass{//内部类
        //不能有静态的东西
        private int data2;
        public void fun2(){
            System.out.println("fun2");
        }
    }

    static class InnerClass2{//静态内部类 可以有任意类型的成员
        private int data3;
        public static int data4;
        public void fun3(){
            System.out.println("out::func3()");
        }
    }
}


public class testdemo {
    public static void main(String[] args) {
        OuterClass outerclass = new OuterClass();//实例化外部类
        OuterClass.InnerClass innerClass = outerclass.new InnerClass();//实例化内部类
        OuterClass.InnerClass2 nbl = new OuterClass.InnerClass2();//实例化静态内部类
    }
}
