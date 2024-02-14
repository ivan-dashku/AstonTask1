import java.util.*;

public class MyArrayList<E> implements SimpleList<E> {

    private int initialCapacity;
    private E[] array;

    public MyArrayList() {
        this.initialCapacity = 16;
        this.array = (E[]) new Object[initialCapacity];
    }

    public int size() {
        for (int i = 0; i < array.length; i++) {
            if(array[i] == null){
                return i;
            }
        }
        return 0;
    }



    public boolean add(E e) {
        for (int i = 0; i < array.length ; i++) {
            if (array[i] == null){
                array[i] = e;
                return  true;
            }

        }
        return false;
    }

    @Override
    public void Clear() {
        array = (E[])new Objects[0];

    }


    public boolean remove(Object o) {
        for (int i = size(); i > 0 ; i--) {
            if (array[i] == o) {
                E tmp = array[i];
                array[i] = null;
                createNewArray(array);
        }
    }
        return true;
    }


    public E get(int index) {
        return array[index];
    }

    public E set(int index, E element) {
        return array[index] = element;
    }

    public void add(int index, E element) {
        for (int i = size(); i > index ; i--) {
            array[i] = array[i-1];
        }
        array[index] = element;
    }

    public E remove(int index) {
        E tmp = array[index];
        if(index < size ()){
            array[index] = null;
            createNewArray(array);
        }
        return tmp;
    }

    public void createNewArray(E[] array){
        E[] mass = (E[]) new Object[array.length];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            mass[j] = (array[i] != null) ? array[i] : array[++i];
            j++;
            if (array [i] == null && i + 1 < initialCapacity && array[i+1] == null){
                break;
            }
        }
        this.array = mass;
    }



}
