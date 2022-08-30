//深拷贝
class Person implements Cloneable{
    public int id;

    @Override
    public String toString() {
        return "person{" +
                "id=" + id +
                '}';
    }

    @Override//object的克隆方法  因为在Object中这个方法是protect的 在不同包的不同子类下无法直接使用，这里就需要重写方法，然后在用
    //super关键字来调用父类的clone方法。
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
        //super关键字只能在类中使用
    }
}

/*
克隆类
 */
public class test3 {
    public static void main(String[] args) throws CloneNotSupportedException{
        Person person = new Person();
        Person person2 = (Person)person.clone();
    }
}

