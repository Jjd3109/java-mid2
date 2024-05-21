package collection.array;

import java.util.Arrays;

public class ArrayMain2 {
    public static void main(String[] args) {

        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        System.out.println(Arrays.toString(arr));

        //배열의 첫번째 위치에 추가
        System.out.println("배열의 첫번째 위치에 3 추가 0(n)");
        int newValue = 3;
        addFrist(arr, newValue);

        //index 위치에 추가
        //기본 배열의 데이터를 한칸씩 뒤로 밀고 배열의 index 위치에 추가
        System.out.println("배열의 index(2)위치에 4 추가");
        int index = 2;
        newValue = 4;
        addAtIndex(arr, index, newValue);
    }

    private static void addAtIndex(int[] arr, int index, int newValue) {
        for(int i = arr.length-1; i > index ; i--){
            arr[i] = arr[i - 1];
        }
        arr[index] = newValue;

        System.out.println(Arrays.toString(arr));

    }

    private static void addFrist(int[] arr, int newValue) {

        for(int i = arr.length-1; i > 0 ; i--){
            arr[i] = arr[i - 1];
        }

        arr[0] = newValue;
        System.out.println(Arrays.toString(arr));

    }
}
