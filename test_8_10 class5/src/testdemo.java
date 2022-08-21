import java.util.Arrays;
import java.util.Scanner;

public class testdemo {

    public static  int facSum(int n){//求阶乘的和
        int sum = 0;
        for (int i = 1; i <=n ; i++) {
            sum +=  fac(i);
        }
        return sum;
    }

    public static int fac(int n){
        int ret = 1;
        for (int i = 1; i <= n ; i++) {
            ret*=i;
        }
        return ret;
    }

    public static void main1(String[] args) {
        int sum = facSum(5);
        System.out.println(sum);
    }

    /**
     * 方法的重载：1.方法名称必须一样
     * 2.方法参数必须不一样
     * 3.返回值无要求
     * @param args
     */
    public static int sum(int a,int b){
        return a+b;
    }
    public static double sum(double a,double b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static void main2(String[] args) {
        int ret1 = sum(2,3);
       int ret2 =  sum(2,3,5);
       double ret3 =  sum(1.5,2.7);
       System.out.println(ret1);
       System.out.println(ret2);
       System.out.println(ret3);
    }

    public static int max3(int a,int b,int c){
        int ret = max2(a,b);
        return ret>c?ret:c;
    }
    public static int max2(int a,int b){
        return a>b?a:b;
    }
    public static void main3(String[] args) {
       int a =  max3(5,8,15);
       System.out.println(a);
    }

    public static void main4(String[] args) {
        int a = fac(5);
        System.out.println(a);
    }

    public static int Fibo(int n){
        if(n>0 && n<=2){
            return 1;
        }
        if(n<=0){
            return -1;
        }
        int f1 = 1;
        int f2 = 1;
        int f3 = 0;
        for (int i = 3; i <= n ; i++) {
            f3 = f1+f2;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }
    //斐波那契数列 1 1 2 3 5
    public static void main5(String[] args) {
        int ret = Fibo(1);
        System.out.println(ret);
    }
    public static int sum1(int a,int b){
        return a>b?a:b;
    }

    public static double sum1(double a,double b,double c){
        double ret = a>b?a:b;
        return ret>c?ret:c;
    }


    public static void main6(String[] args) {
        int ret = sum1(5,3);
        double ret1 = sum1(1.5,5.4,8.5);
        System.out.println(ret);
        System.out.println(ret1);
    }

    /**
     * 递归：计算阶乘
     * @param args
     */
    public static int fac1(int n) {
        if(n == 1){
            return 1;
        }
        int ret = n*fac1(n-1);
        return ret;
    }


    public static void factor(int n){
        if(n>9){
            factor(n/10);
        }
        System.out.println(n % 10);
    }


    public static int sum(int n){
        if(n == 0){
            return 0;
        }
        return n%10+sum(n/10);
    }

    public static int fun2(int n){
        if(n == 1){
            return 1;
        }
        return n+fun2(n-1);
    }

    public static int fibo(int n){//求斐波那契数列第n项
        if(n == 1 || n == 2){
            return 1;
        }
        return fibo(n-1)+fibo(n-2);
    }

    public static void main7(String[] args) {
        int a = sum(123);
        System.out.println(a);
    }


    public static void move(char post1,char post2){
        System.out.printf(post1+"->"+post2+" ");
    }

    /**
     *
     * @param n  盘子的个数
     * @param post1 起始位置
     * @param post2 中转位置
     * @param post3 目标位置
     */
    public static void hanio(int n,char post1, char post2 , char post3) {
        if(n==1){
            move(post1,post3);
            return;
        }
        hanio(n-1,post1,post3,post2);//让n-1个盘子，从起始位置移动到中转位置
        move(post1,post3);//将最底下的盘子从起始位置移到目标位置
        hanio(n-1,post2,post1,post3);//让中专位置的盘子移动到目标位置
    }

    public static void main8(String[] args) {
        //汉诺塔
        hanio(1,'A','B','C');
        System.out.println();
        hanio(2,'A','B','C');
        System.out.println();
        hanio(3,'A','B','C');
        System.out.println();
        hanio(4,'A','B','C');
        System.out.println();
        hanio(5,'A','B','C');
        System.out.println();
    }


    public static void main(String[] args) {
        //数组
        int[] arr = {1,2,3};//直接赋值
        int[] arr1 = new int[]{1,2,3};//动态赋值
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
        for (int x:arr1) {//foreach
            System.out.println(x+" ");
        }
        //没有区别，只有写法上的区别
        //如果不初始化，会只分配内存，内容默认都为0

        //Arrays 把数组变成字符串
        String ret = Arrays.toString(arr);
        System.out.println(ret);
    }
}
