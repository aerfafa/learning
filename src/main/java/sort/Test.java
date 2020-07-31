package sort;

import java.util.Arrays;

/**
 * @Todo
 * @Author mina
 * @Date 2020-07-31  19:29
 */
public class Test {


    public static void main(String args[]){

        int arr[] = {11,2,3,16,22,9};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr.length-i-1 ; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
