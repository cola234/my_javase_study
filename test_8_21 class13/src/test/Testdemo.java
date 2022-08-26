package test;
/*
多态的思想：同一个引用结果是两种状态
 */
class Animal{
    public String name;
    public int age;

    public void eat(){
        System.out.println("Animal::eat()");
    }
}

class Dog extends Animal{
    public boolean silly;
    /*
    复写，名字 返回值 参数列表都完全相同
     */
    @Override
    public void eat(){
        System.out.println("Dog::eat()");
    }
}

class Cat extends Animal{
    public boolean silly;
    /*
    复写，名字 返回值 参数列表都完全相同
     */
    @Override
    public void eat(){
        System.out.println("Cat::eat()");
    }
}

public class Testdemo {
/*
向上转型：创建一个子类当父类来使用，这里是函数方法传参
在向上转型中，无法访问到子类中特有的方法，但是如果父类和子类中都有同一种方法并且发生了重写，那就可以调用
 */
    public static void function(Animal animal){
        animal.eat();
    }
    public static void main(String[] args) {
        Dog dog = new Dog();
        function(dog);
        Cat cat = new Cat();
        function(cat);
    }
}

/*
这是一个多态思想的例子，将不同的引用对象当成参数传入同一个函数，运行结果是不同的。
 */




/*
首先发生了向上转型，将一个子类当成父类来用，function接受的参数是已经实例化的子类，但是他原本的参数是父类，所以这里就是把子类赋值给了父类。
然后父类进行了方法的调用，以dog为例，这里又发生了动态绑定，在向上转型中，子类和父类如果发生了重写，那么就会发生动态绑定，即在编译时无法确定方法，
在程序运行时才能知道。如果子类有这个方法，那么就会优先调用子类，如果子类没有，才会调用父类。
 */