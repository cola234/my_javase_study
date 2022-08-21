import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

import java.util.Scanner;

public class testdemo {
    public static void main1(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a==b);
    }

    public static void main2(String[] args) {
        int a = 1;
        int b = 2;
        //System.out.println(a && b);//&&必须是两个布尔表达式
        //System.out.println(!a);//!后面也必须是布尔表达式
    }

    public static void main3(String[] args) {
        int a = 10;
        int b = 20;
        int c = a & b;
        int d = a | b;
        int f = a ^ b;
        int g = ~a;
        System.out.println(c);
        System.out.println(d);
        System.out.println(f);
        System.out.println(g);
        //&：按位与，如果两个二进制位都为1，则结果为1，否则为0  找全1
        //01010
        //10100
        //00000
        //|：按位或，如果两个二进制位都为0，则结果为0，否则为1  找全0
        //01010
        //10100
        //11110
        //^：按位异或，如果两个二进制位一样，则结果为0，否则为1
        //01010
        //10100
        //00000
        //11110
        //~：按位取反，如果为1，结果为0，如果为0，结果为1
        //01010
        //10101
    }

    /*
    素数
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a <= 1){
            System.out.println("非法！");
            return;
        }
        else if (a == 2){
            System.out.println(a+"是素数");
            return;
        }
        else{
            for (int i = 2; i < Math.sqrt(a); i++) {
                if(a % i == 0){
                    System.out.println(a+"不是素数");
                    return;
                }
//                else{
//                    System.out.println(a+"是素数");
//                    return;
//                }
            }
            System.out.println(a+"是素数");
        }
    }

        public static void main5(String[] args) {
            int i, j;
            for(i=1; i<=100; i++){
                for(j=2; j<=i; j++){//判断除了1和本身能否被其他数整除
                    if(i%j==0){
                        break;
                    }
                }
                if(j==i){
                    System.out.print(i+" ");
                }
            }
        }

    public static void main6(String[] args) {
        for (int i = 1000; i <=2000 ; i++) {
            if(i %4 == 0 && !(i %100 == 0)){//普通闰年
                System.out.printf(i+"是普通闰年 ");
            }
            if(i%400 == 0){
                System.out.printf(i+"是世纪闰年 ");
            }
        }
    }

    public static void main7(String[] args) {
        int count = 0;
        for (int i = 1; i < 100 ; i++) {
            if(i>=1 && i<10)
            {
                if(i%10 == 9)
                {
                    count++;
                }
            }
            else{
                if(i%10 == 9 || i/10%10==9){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

