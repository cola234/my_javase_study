import java.util.Arrays;
import java.util.Scanner;

public class testdemo {

    public static void transform(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
    }

    public static double avg(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum*1.0/arr.length;
    }


    public static void main1(String[] args) {
        int[] arr = {1,2,3,4};
        //transform(arr);
        double ret = avg(arr);
        System.out.println(ret);
    }

    public static void main2(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int left = arr[0];
        int right = arr[arr.length-1];
        while (true) {
            int i = 0;
            int j = 0;
            for (i = 0; i < arr.length; i++) {
                if(arr[i] % 2 == 0){
                    break;
                }
            }
            for (j = arr.length-1; j >= 0; j--) {
                if(arr[j] % 2 != 0){
                    break;
                }
            }
            if(i > j){
                break;
            }
            //交换
            int tmp = 0;
            tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static int binarySerach(int[] arr,int key){
        int left = 0;
        int right = arr.length-1;
        while (left<=right){
            int mid = (left+right)/2;
            if(arr[mid] < key){
                left = mid+1;
            } else if (arr[mid] > key) {
                right = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    public static void main3(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int ret = binarySerach(arr,9);
        if(ret == -1){
            System.out.println("没有找到！");
        }
        else {
            System.out.println("下标是"+ret);
        }
    }

    public static String serach(int[] arr,int target){
        int[] arr1 = new int[2];
        //1.排序
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j] == target){
                    arr1[0] = i;
                    arr1[1] = j;
                }
                else if(arr[i] + arr[j] > target){
                    break;
                }
            }
        }
        String ret = Arrays.toString(arr1);
        return ret;
    }

    public static void main4(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 0;
        Scanner sc = new Scanner(System.in);
        target = sc.nextInt();//9
        String ret = serach(nums,target);
        System.out.println(ret);
    }

    public static void main5(String[] args) {
        int[] arr = {1,2,1,2,1,2,8};
        Arrays.sort(arr);
        if(arr[0] == arr[1]){
            System.out.println(arr[arr.length-1]);
        }else {
            System.out.println(arr[0]);
        }
    }

    public static void main6(String[] args) {
        int[] arr = {1,2,1,2,3,3,2,2,2,2};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] != arr[j]){
                    break;
                } else{
                    count++;
                    if(count == arr.length/2 ){
                        System.out.println(arr[i]);
                        break;
                    }
                }
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = {1,2,34,3,4,5,7,23,12};
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] %2 == 0 || arr[j] %2 == 0){
                    break;
                }else {
                    count++;
                }
                if(count == 2){
                    System.out.println(true);
                }
            }
        }
    }
}
