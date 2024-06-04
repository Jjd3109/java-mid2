package collection.array;

import java.util.Arrays;

public class MyArrayListV4<E> {

    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size= 0;

    public MyArrayListV4() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV4(int initialCapctiy){
        elementData = new Object[initialCapctiy];
    }

    public int size(){
        return size;
    }

    public E get(int index){
        return (E) elementData[index];
    }

    public E set(int index, E element){
        E oldValue = get(index);
        elementData[index] = element;
        return oldValue;
    }


    public void add(E e){
        //코드 추가
        if(size == elementData.length){
            grow();
        }

        elementData[size] = e;
        size++;
    }


    //코드 추가
    public void add(int index, E e){
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

    public E remove(int index){
        E oldValue = get(index);
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

