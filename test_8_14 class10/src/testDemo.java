import java.util.Arrays;


class Dog{
    public String name;
    public String color;

    public void barks(){
        System.out.println(name+"汪汪叫");
    }

    public void wag(){
        System.out.println(name+"摇尾巴");
    }
}

public class testDemo {
    
    public static void bubblesort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int flg = 0;
            for (int j = 0; j <arr.length-1-i ; j++) {
                if(arr[j] > arr[j+1]){
                    flg++;
                    int tmp = 0;
                    tmp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
            if(flg == 0){
                break;
            }
        }
    }
    
    public static void main5(String[] args) {
        int[] arr = {10,8,7,5,8,2,4,3,5};
        bubblesort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    /**
     * 二维数组
     * @param args
     */
    public static void main6(String[] args) {
        int[][] arr1 = new int[2][3];//不初始化
        int[][] arr2 = new int[][] {{1,2,3},{4,5,6}};//初始化
        int[][] arr3 = {{1,2,3},{4,5,6}};

        for (int[] arr:arr3) {
            for (int x:arr) {
                System.out.println(x);
            }
        }
        //System.out.println(Arrays.deepToString(arr3));
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.color="黄色";
        dog.name = "老谢";
        dog.barks();
        dog.wag();
    }
}
