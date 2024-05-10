package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Optional;

public class ArrayWrapper<T> {
    private T[] array;
    private int size ;

    public ArrayWrapper() {
        array = (T[]) new Object[size];
    }

    public void add(T addedElement) {
        T[] newArray = Arrays.copyOf(array, size + 1);
        newArray[size] = addedElement;
        array = newArray;
        size++;
    }

    public Optional<T> get(int index) {
        try {
            return Optional.ofNullable(array[index]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            return Optional.empty();
        }
    }

    public Optional<T> remove(int index) {
        if (array.length != 0) {
            try {
                T deleted = array[index];
                array[index] = null;
                int j = 0;
                T[] newArray = (T[]) new Object[size - 1];
                for (int i = 0; i < array.length - 1; i++) {
                    if (array[i] != null) {
                        newArray[j] = array[i];
                        j++;
                    }
                }
                array = newArray;
                size--;
                return Optional.ofNullable(deleted);
            } catch (IndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
                return Optional.empty();
            }
        } else {
            return Optional.empty();
        }
    }

    public int size() {
        return size;
    }

    public Optional<Integer> indexOf(T element) {
        Integer index = null;
        for(int i = 0 ;i<size;i++){
            if(array[i]==element){
                index = i;
                break;
            }
        }
        return Optional.ofNullable(index);
    }
    public boolean contains(T element){
        boolean check = false;
        for(int i = 0;i<size;i++){
            if(array[i]==element){
                check = true;
            }
        }
        return check;
    }
    public ArrayWrapper<T> sort(){
        Arrays.sort(array);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<size;i++){
            sb = sb.append(array[i]).append(" ");
        }
        return sb.toString();
    }
}
