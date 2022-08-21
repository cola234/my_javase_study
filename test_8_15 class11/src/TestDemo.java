
//class Dog{
//
//    public String name;
//    public int age;
//    public void wags(){
//        System.out.println("汪汪汪");
//    }
//}

class Study{
    public Study(String name, int age) {
        System.out.println("调用了study的构造方法");
        this.name = name;
        this.age = age;
    }

    public String name;
    public int age;

    public void setStudy(String n,int a){
        name = n;
        age = a;
    }
    public void sout(){
        System.out.println(name);
        System.out.println(age);
    }
    public void sout1(){
        this.sout();
    }
}


public class TestDemo {

    public static void main1(String[] args) {
//        Dog dog = new Dog();
//        System.out.println(dog.age);
//        System.out.println(dog.name);
        /*
        在类中如果没有赋值直接打印，打印的内容是成员变量的默认值，
        String是字符指针是null
        int等基本类型是0 char是"\u0000"
        bollen是false


        方法的前面有一个隐藏形参 this 传递的是名字
         */
    }
/*
构造方法：
1.必须和类名相同，创建在类里面
2.可以手动创建，如果手动创建，则不会编译器自动生成
3.可以重载
4.实例化类时，会调用这个构造方法，且在这个类的整个生命周期中只调用一次。

 */
    public TestDemo() {//这是一个构造方法
        System.out.println("调用了构造方法");
        int age = 5;
        int b = 10;
    }

    public static void main(String[] args) {
        TestDemo ts = new TestDemo();
        Study study = new Study("zhangsan",18);
        study.setStudy("zhangsan",15);
        study.sout1();
    }
}
