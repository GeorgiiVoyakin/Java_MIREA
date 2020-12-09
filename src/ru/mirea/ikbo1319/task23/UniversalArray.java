package ru.mirea.ikbo1319.task23;

public class UniversalArray<T> {
    private T[] data;

    public UniversalArray(T[] data) {
        this.data = data;
    }

    public T[] getData() {
        return data;
    }

    public T get(int i) throws Exception {
        if (i < 0 | i >= data.length) {
            throw new Exception("Array out of bounds");
        } else {
            return data[i];
        }
    }
}
