package collection.array;

import java.util.Arrays;

public class MyArrayListV3 {

    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size= 0;

    public MyArrayListV3() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV3(int initialCapctiy){
        elementData = new Object[initialCapctiy];
    }

    public int size(){
        return size;
    }

    public Object get(int index){
        return elementData[index];
    }

    public Object set(int index, Object element){
        Object oldValue = get(index);
        elementData[index] = element;
        return oldValue;
    }


    public void add(Object e){
        //코드 추가
        if(size == elementData.length){
            grow();
        }

        elementData[size] = e;
        size++;
    }

    //코드 추가
    public void add(int index, Object e){
        if(size == elementData.length){
            grow();
        }
        //데이터이동
        shiftRightFrom(index);
        elementData[index] = e;
        size++;
    }

    private void shiftRightFrom(int index) {
        for(int i = size; i> index; i--){
            elementData[i] = elementData[i - 1];
        }
    }

    public Object remove(int index){
        Object oldValue = get(index);
        //데이터 이동
        shiftLeftFrom(index);

        size--;
        elementData[size] = null;
        return oldValue;
    }

    private void shiftLeftFrom(int index) {
        for(int i = index; i < size - 1; i++){
            elementData[i] = elementData[i+1];
        }
    }

    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;
        //배열을 새로 만들고, 기존 배열을 새로운 배열에 복사
        elementData = Arrays.copyOf(elementData, newCapacity);


    }

    @Override
    public String toString() {
        return "MyArrayListV3{" +
                "elementData=" + Arrays.toString(elementData) +
                ", size=" + size +
                ", capacity=" + elementData.length +
                '}';
    }
}

