package ca.ubc.cs.cpsc210.integerset.util;

import java.util.LinkedList;
import java.util.List;


// Represents a set of integers
public class IntegerSet {
	
	// Store the actual values of the IntegerSet in a List
	private List<Integer> data;

    // Constructor
    // EFFECTS: set is empty
	public IntegerSet() {
		data = new LinkedList<Integer>();
	}

    // Inserts element into the IntegerSet
    // MODIFIES: this
    // EFFECTS: Integer i is added to the IntegerSet if it's not
    // already in the IntegerSet
	public void insert(Integer i) {
		if (!contains(i))
			data.add(i);
	}

    // Removes element from the IntegerSet
    // REQUIRES: Integer i is an element of the IntegerSet
    // MODIFIES: this
    // EFFECTS: Integer i is removed from the IntegerSet
	public void remove(Integer i) {
		data.remove(i);
	}

    // Determines if element is in the IntegerSet
    // EFFECTS: Returns true if Integer i is in the IntegerSet
    // and false otherwise
	public boolean contains(Integer i) {
		return data.contains(i);
	}

    // Gets the size of the IntegerSet
    // EFFECTS: Returns the number of items in the set
	public int size() {
		return data.size();
	}
}
