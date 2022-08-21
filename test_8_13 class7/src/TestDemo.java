import java.util.Arrays;

public class TestDemo {
    public static void main1(String[] args) {
        int a = 10;
        int b = 20;
        int[] arr = {1, 2, 3, 4};
    }

    public static void main2(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(arr));
        int[] arr2 = arr;
        arr2[1] = 99;
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr));
    }

    public static void fun1(int[] arr) {//形参是实参的一份拷贝
        arr = new int[10];
    }

    public static void fun2(int[] arr) {
        arr[0] = 99;
    }


    public static String mytostring(int[] tmp) {
        if (tmp == null) {
            return null;
        }
        String ret = "[";
        for (int i = 0; i < tmp.length; i++) {
            ret += tmp[i];
            if (i != tmp.length - 1) {
                ret += ",";
            }
        }
        ret += "]";
        return ret;
    }

    public static void main4(String[] args) {
        int[] arr = {1, 2, 3, 4};
        //fun1(arr);
        String ret = mytostring(arr);
        System.out.println(ret);
    }

    public static void binarySerach(int[] arr, int key) {
        int left = arr[0];
        int right = arr[arr.length - 1];
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == key) {
                System.out.println("找到了，下标是" + mid);
                return;
            } else if (arr[mid] < key) {
                left = mid+1;
            } else {
                right = mid-1;
            }
        }
        System.out.println("没找到");
    }


    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8};
        Arrays.sort(arr1);//让数组有序
        binarySerach(arr1,8);
    }
}
