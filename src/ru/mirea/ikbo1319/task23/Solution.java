package ru.mirea.ikbo1319.task23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class Solution {

    @SafeVarargs
    public static <T> ArrayList<T> newArrayList(T... objects) {
        ArrayList<T> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, objects);
        return arrayList;
    }

    @SafeVarargs
    public static <T> HashSet<T> newHashSet(T... objects) {
        HashSet<T> hashSet = new HashSet<>();
        Collections.addAll(hashSet, objects);
        return hashSet;
    }

    @SafeVarargs
    public static <K, V> HashMap<K, V> newHashMap(V[] values, K... keys) {
        HashMap<K, V> hashMap = new HashMap<>();
        int i = 0;
        for (K key : keys) {
            hashMap.put(key,values[i]);
        }
        return hashMap;
    }
}
