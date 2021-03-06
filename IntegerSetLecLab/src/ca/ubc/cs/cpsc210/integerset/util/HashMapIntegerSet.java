package ca.ubc.cs.cpsc210.integerset.util;

import java.util.HashMap;

// An implementation of IntegerSet using HashMap
public class HashMapIntegerSet implements IntegerSet {

    // Store the values that belong to the IntegerSet in a HashMap
    private HashMap<Integer, Boolean> data;

    // Constructor
    // EFFECTS: set is empty
    public HashMapIntegerSet() {
        data = new HashMap<Integer, Boolean>();
    }

    public void insert(Integer i) {
        if (!data.containsKey(i))
            data.put(i, true);
    }

    public void remove(Integer i) {
        data.remove(i);
    }

    public boolean contains(Integer i) {
        return data.containsKey(i);
    }

    public int size() {
        return data.size();
    }

    @Override
    public IntegerSet intersection(IntegerSet otherSet) {
        return null;
    }
}

