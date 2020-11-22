package com.company;


public class WyjatkiZ3 {
    private int[] array;
    private int index;

    public WyjatkiZ3(int[] array, int index) {
        this.array = array;
        this.index = index;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int plusFive(int[] array, int index) {
        if (index < 0 || index > array.length - 1) {
            throw new IndexOutOfBoundsException("IndexOutOfBoundsException");
        }

        return array[index] + 5;
    }
}
