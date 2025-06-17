package ch15;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyArrayList {
    private String[] arr = new String[0];

    public int size() {
        return this.arr.length;
    }

    public void add(String item) {
        String[] temp = new String[size() + 1];
        for (int i = 0; i < size(); i++) {
            temp[i] = arr[i];
        }
        temp[size()] = item;
        arr = temp;
    }

    public void add(int index, String item) {
        String[] temp = new String[size() + 1];
        for (int i = 0; i < index; i++) {
            temp[i < index ? i : i + 1] = arr[i];
        }
        this.arr = temp;
    }

    public void checkValues() {
        System.out.println(Arrays.toString(arr));
    }

    public String get(int idx) {
        return arr[idx];
    }

    public String remove() {
        String[] temp = new String[size() - 1];
        String etc = arr[temp.length];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
        return etc;
    }

    public String remove(int index) {
        String[] temp = new String[size() - 1];
        String item = arr[index];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = arr[i<index?i:i+1];
        }
        arr = temp;
        return item;
    }
}
