package se.array;

public class TestArr {

    public static void main(String args[]){

        int arr[] = {1,23,4,15};
        int[] ints = sortArr(arr);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }


    }


    public static  int[] sortArr(int arr[]){

        for (int i = 0; i < arr.length; i++) {

            for (int j = i+1; j <  arr.length; j++) {

                if(arr[j] > arr[i]){

                    int temp  = arr[j];
                    arr[j] =arr[i];
                    arr[i] = temp;
                }



            }
        }

    return  arr;
    }

}
