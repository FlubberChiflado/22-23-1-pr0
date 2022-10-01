package edu.uoc.ds.adt;

public class PR0Array {
    private int[] array;

    public PR0Array(){
        this.array = new int[50];
    }

    public int[] getArray() {
        int i = 0, num = -2;

        while (i < array.length){
            num += 2;
            this.array[i] = num;
            i++;
        }
        return this.array;
    }

    public int getIndexOf (int n){
        int i = 0;

        while (i < array.length && n >= 0 && n <= 98){
            if (array[i] == n)
                return (i);
            i++;
        }
        return (-1);
    }

    public int binarySearch(int n){
        int i = 0;

        if (array[array.length / 2] > n) {
            while (i < array.length / 2 && n > 0) {
                if (array[i] == n)
                    return (i);
                i++;
            }
        } else {
            i = array.length / 2;
            while (i < array.length && n <= 98) {
                if (array[i] == n)
                    return (i);
                i++;
            }
        }
        return (-1);
    }
}
