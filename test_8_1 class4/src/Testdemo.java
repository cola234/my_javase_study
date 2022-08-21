import java.util.Random;
import java.util.Scanner;

public class Testdemo {
    public static void main1(String[] args) {
        int i = 0;
        int sum = 0;
        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }

    public static void main2(String[] args) {
        int i = 0;
        int sum = 0;
        while (i <= 100) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println(sum);
    }

    public static void main3(String[] args) {
        int i = 0;
        int sum = 0;
        while (i <= 100) {
            if (i % 2 != 0) {
                sum += i;
            }
            i++;
        }
        System.out.println(sum);
    }

    public static void main4(String[] args) {
        int sum = 0;
        int ret = 1;
        int i = 1;
        int j = 5;
        while (j >= 1) {//5 4 3 2 1
            while (i <= j)//5的阶乘 1 2 3 4 5
            {
                ret *= i;
                i++;
            }
            sum += ret;
            j--;
            i = 1;
            ret = 1;
        }
        System.out.println(sum);
    }

    public static void main5(String[] args) {
        int i = 0;
        while (i <= 100) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
                i++;
                continue;
            }

        }
    }

    public static void main6(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入你的年龄：");
        int age = sc.nextInt();
    }

    public static void main7(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            System.out.println("请输入");
            int a = sc.nextInt();
            System.out.println(a);
        }
    }

    public static void main8(String[] args) {
        //猜数字
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int n = random.nextInt(100);//0-100随机数
        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            if (a > n) {
                System.out.println("猜大了");
            } else if (a < n) {
                System.out.println("猜小了");
            } else {
                System.out.println("猜对了");
                break;
            }
        }
    }


    //输入一个数
    //1.对这个数按位取反然后+1，这里输入的是1744 二进制位011011010000
    /*
    按位取反加1后得到100100110000  这里可以分为两部分，一部分是最后一个1以前的二进制位，一部分是二进制位以后的二进制位
    按位取反+1后，后半部分变成了10000，前半部分则依旧是按位取反之后的数
    然后在将1744与得到的数异或，这样前半部分的值变为原来的值，后半部分全部变为0，也就是去掉了最后一位1，count++
     */
    public static void main9(String[] args) {//求二进制1的个数
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();//输入一个数
        while (a != 0) {
            int n = a & (~a + 1);
            a ^= n;
            count++;
        }
        System.out.println(count);
    }


    public static void main10(String[] args) {//解法2 右移
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();//输入一个数
        int flag = 1;
        while (a != 0) {
            if ((a & flag) != 0) {
                count++;
            }
            a = a >> 1;
        }
        System.out.println(count);
    }


    /*
    计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值 。
     */
    public static void main11(String[] args) {
        double n = 1;
        double sum = 0;
        while (n <= 100) {
            double b = 1 / n * Math.pow(-1, (n - 1));
            sum += b;
            n++;
        }
        System.out.println(sum);
    }

    //判断一个数是不是水仙花数
    public static void main12(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();//输入一个数
        if (a >= 0 && a <= 99) {
            System.out.println("没有水仙花数");
            return;
        } else if (a > 99) {
            int c = 100;
            while (c <= 999) {//100-999 循环数
                int b = c;
                int sum = 0;
                //2.拿出每一位
                while (b != 0) {
                    int n = b % 10;
                    b /= 10;
                    sum += Math.pow(n, 3);
                }
                if (sum == c) {
                    System.out.println(sum);
                }
                c++;
            }
        } else {
            System.out.println("输入错误");
        }
    }

    public static void main13(String[] args){//输入一个x
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()){
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if(i == j || i+j == n-1){
                        System.out.printf("*");
                    }else {
                        System.out.printf(" ");
                    }
                }
                System.out.println();
            }
        }
    }

    public static void main14(String[] args) {//乘法口诀表
        for (int i = 1; i <= 9; i++) {
            for (int j = i; j <=9; j++) {
                System.out.printf(i+"*"+j+"="+i*j);
                System.out.printf("    ");
            }
            System.out.println();
        }
    }

    public static void main15(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n!=0)
        {
            System.out.println(n%10);
            n /= 10;
        }
    }


    public static void main16(String[] args) {//模拟登陆
        Scanner sc = new Scanner(System.in);
        int count = 3;
        while (count != 0){
            String pass = sc.nextLine();//输入数据
            if(pass.equals("123")){
                System.out.println("登陆成功！");
                break;
            }else {
                System.out.println("登陆失败");
            }
            count--;
        }
    }


    public static void main17(String[] args) {
        //找一个二进制的奇数位和偶数位并输出
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//输入一个数
        int count = 0;
        int j = 32;
        while (j != 0){
            int a = n & 1;
            n = n>>1;
            count++;
            if(count % 2 == 0){
                System.out.printf(a+" ");
            }else {
                System.out.printf(a+" ");
            }
            j--;
        }
    }
}
