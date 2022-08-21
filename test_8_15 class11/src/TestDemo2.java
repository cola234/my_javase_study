class Study1{

    public Study1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;
    public static String classes;//静态成员变量

    public void print(){
        System.out.println(this.name +"->"+ this.age + "->" +classes);
    }
}
class Test {
    public static void hello() {
        System.out.println("hello");
    }
}

/*
封装：使用不同的修饰限定符限定访问权限。
 */
public class TestDemo2 {
    public static void main1(String[] args) {
        Study1.classes="106JAVA";
        Study1 st1 = new Study1("zhangsan1",180);
        st1.print();
        Study1 st2 = new Study1("zhangsan2",181);
        st2.print();
        Study1 st3 = new Study1("zhangsan3",182);
        st3.print();
    }


        public static void main(String[] args) {
            // TODO Auto-generated method stub
            Test test=null;
            test.hello();
        }
}


