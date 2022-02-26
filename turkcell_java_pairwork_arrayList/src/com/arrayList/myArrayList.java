package com.arrayList;

public class myArrayList<T> {
    int count;
    private Object[] arr = {};

    public void add(T t) {

        Object[] newArr = new Object[arr.length + 1];

        System.arraycopy(arr, 0, newArr, 0, arr.length);

        newArr[arr.length] = t;

        arr = newArr;
    }

    public void remove(Object e) {
        int counter = 0;

        Object[] newArr = new Object[arr.length - 1];

        for (int i = 0; i < arr.length; i++) {
            if(!(arr[i] == e)) {
                newArr[counter] = arr[i];

                counter++;
            }
        }

        arr = newArr;
    }

    public int size() {
        return arr.length;
    }

    public boolean contains(Object e) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == e) {
                return true;
            }
        }
        return false;
    }


}
