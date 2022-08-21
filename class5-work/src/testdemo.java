public class testdemo {

    public static int fac(int n){
        if(n>=1){
            return n*fac(n-1);
        }
        return 1;
    }

    public static int sumAdd(int n){
        if(n>=1){
            return n+sumAdd(n-1);
        }
        return 0;
    }

    public static void factor(int n){//求每一位
        if(n>9){
            factor(n/10);
        }
        System.out.println(n%10);
    }

    public static int factorSum(int n){//求每一位
        if(n>9){
            return n%10 + factorSum(n/10);
        }
        return n;
    }

    public static int fibo(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        return fibo(n-1)+fibo(n-2);
    }

    public static void move(char post1,char post2){
        System.out.print(post1+ "->"+post2+" ");
    }

    public static void hanio(int n,char post1,char post2,char post3){
        if(n == 1){
            move(post1,post3);
            return;
        }
        hanio(n-1,post1,post3,post2);
        move(post1,post3);
        hanio(n-1,post2,post1,post3);
    }

    public static void main1(String[] args) {
        hanio(1,'A','B','C');
        System.out.println();
        hanio(2,'A','B','C');
        System.out.println();
        hanio(3,'A','B','C');
        System.out.println();
        hanio(4,'A','B','C');
        System.out.println();
        hanio(5,'A','B','C');
    }

    public static void main2(String[] args) {
        int[] arr = {1,2,3,4};
        int[] arr1 = new int[]{1,2,3,4};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
        for (int x:arr) {
            System.out.print(x);
        }
        System.out.println();
        for (int y:arr1) {
            System.out.print(y);
        }
    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr= new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=i;
        }
        printArray(arr);
    }
}
