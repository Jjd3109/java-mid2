package collection.array;

import java.util.Arrays;
import java.util.OptionalInt;

public class ArrayMain1 {

    public static void main(String[] args) {
        int[] arr = new int[5];

        //index 입력 : 0
        System.out.println("==index 입력 : 0 (1) ==");
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        System.out.println(Arrays.toString(arr));

        for(int i = 0; i < arr.length - 1; i++){
            arr[i+1] = arr[i];
        }
        arr[0] = 2;

        System.out.println(Arrays.toString(arr));

    }
}
