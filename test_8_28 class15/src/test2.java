
/*
深拷贝
 */
class Person2 implements Cloneable{
    public int m;

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Person1 implements Cloneable{
    public int id;
    Person2 person2 = new Person2();

    @Override
    public String toString() {
        return "person{" +
                "id=" + id +
                '}';
    }

    @Override//object的克隆方法  因为在Object中这个方法是protect的 在不同包的不同子类下无法直接使用，这里就需要重写方法，然后在用
    //super关键字来调用父类的clone方法。
    protected Object clone() throws CloneNotSupportedException {
        Person1 tmp = (Person1) super.clone();//创建一个tmp 先储存从person1拷贝过来的int和person2
        tmp.person2 = (Person2)this.person2.clone();
        return tmp;
    }
}

/*
克隆类
 */
public class test2 {
    public static void main(String[] args) throws CloneNotSupportedException{
        Person person = new Person();
        Person person2 = (Person)person.clone();
    }
}
