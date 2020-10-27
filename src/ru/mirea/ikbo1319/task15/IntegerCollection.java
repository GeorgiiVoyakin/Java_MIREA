package ru.mirea.ikbo1319.task15;

public class IntegerCollection {
    Integer[] array;
    private int size;
    private int capacity;

    public IntegerCollection(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Illegal Capacity: "+ capacity);
        }

        this.capacity = capacity;
        array = new Integer[capacity];
        size = 0;
    }

    public int indexOf(Object o) {
        if (o == null) {
            for (int i = 0; i < size; i++)
                if (array[i] == null)
                    return i;
        } else {
            for (int i = 0; i < size; i++)
                if (o.equals(array[i]))
                    return i;
        }
        return -1;
    }

    public int get(int index) {
        if (index > capacity - 1) {
            throw new IllegalArgumentException("Illegal index of collection: "+ index);
        }
        return array[index];
    }

    public void add(int value) {
        if (size == capacity) {
            Integer[] tmp = array;
            capacity *= 2;
            array = new Integer[capacity];
            System.arraycopy(tmp, 0, array, 0, tmp.length);
        }
        array[size++] = value;
    }

    public int remove(int index) {
        Integer oldValue = array[index];

        if (size-- > index) {
            System.arraycopy(array, index + 1, array, index, size - index);
        }

        array[size] = null;

        return oldValue;
    }

    public int getMax() {
        int max = array[0];
        for (int number : array) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public int getMin() {
        int min = array[0];
        for (int number : array) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public int getAverage() {
        int result = 0;
        for (int number : array) {
            result += number;
        }
        return result / size;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    public void show() {
        System.out.print("[ ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
    }

    @Override
    public String toString() {
        return "IntegerCollection{" +
                "size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
