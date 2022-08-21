import org.omg.CORBA.INTERNAL;

public class HelloWorld {
  public static void main1(String[] args) {
      System.out.println(10);
      System.out.println("hello");
  }

    public static void main2(String[] args) {
        //局部变量
        int a = 10;
        long b = 10L;//必须加L 否则会赋值整形而不是长整型
        System.out.println(a);
        System.out.println(Long.MAX_VALUE);
    }

    public static void main(String[] args) {
      //强转类型转换
        //int a = 10;
        //long b = 100L;
        //a = (int)b;
        //System.out.println(a);

        byte a = -128;
        System.out.println(a);
    }
}
