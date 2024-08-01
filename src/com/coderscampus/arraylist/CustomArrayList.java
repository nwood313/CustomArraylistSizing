package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
    Object[] items = new Object[10];
    int size;
    @Override
    public boolean add(T item) {
        //create if statement to check if the added elements fit into the array
        if (size == items.length) {
            Object[] newItems = new Object[(items.length * 2)];
            for (int i = 0; i < items.length; i++) {
                newItems[i] = items[i];
            }
            items = newItems;
        }
        items [size] = item;
        size++;
        return true;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public T get(int index) {
        if (index >=0 && index<size){
            return (T) items[index];
        }
        return null;
    }

}
