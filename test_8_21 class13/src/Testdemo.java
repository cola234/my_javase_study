class Animal{
    public String name;
    public int age;

    public Animal(String name,int age){
        this.name = name;
        this.age  = age;
    }
    /*
    如果在父类这里自己定义了一个带参数的构造方法，那么子类继承他的时候，必须要对父类的成员进行初始化
    也就是需要在子类中调用父类的构造方法，而如果子类中没有自己添加构造方法，那么在系统默认添加的构造方法是没办法
    对父类的成员变量进行初始化的
     */
    public void HouseProtect(){
        System.out.println(name+"正在保护房子");
    }
}


class Dog extends Animal{
    public boolean silly;
/*
super的作用：访问父类的成员变量/方法/构造方法
 */
    public Dog(String name,int age,boolean silly){
        super(name,age);//这里访问了父类的构造方法
        this.silly = silly;
    }
    public Dog(){
        super("zhangsan",14);//这里访问了父类的构造方法
        this.silly = silly;
    }

    public void eat(){
        System.out.println(name+"正在吃饭");
    }
}

public class Testdemo {
    public static void main(String[] args) {
        //Dog dog1 = new Dog();
        Dog dog = new Dog("zhangsan",14,false);
        dog.eat();
    }
}
