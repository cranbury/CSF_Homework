import java.util.ArrayList;

public class IntMaxHeap {
    private ArrayList<Integer> array;

    public IntMaxHeap() {
        array = new ArrayList<Integer>();
    }

    public void insertValue(int value) {
        // Add to the end of the array
        // Note: The Integer class is an Object wrapper around an int that makes it storable in
        //  Java's collection classes
        // To get an int from an Integer intInstance, call intInstance.intValue() 
        array.add(value);

        if (array.size() > 1)
        {

            // TODO: While the new value is greater than its parent value, "bubble up" the 
            //  new value in the heap by swapping it with its parent node  
            // The object that is added above is at the end of the array (i.e. its index is array.size() - 1)
            // The parent node index of a node at childIndex is (childIndex - 1)/2.
            //  E.g. If a child node is at index 10 in the array, 
            //  its parent node is at position (10-1)/2, which is 4 (integer division rounds down)

            int new_index = array.size() - 1;
            int parent_index = (new_index-1)/2;

            while (array.get(new_index) > array.get(parent_index)) {
                int temp = array.get(new_index);
                array.set(new_index, array.get(parent_index));
                array.set(parent_index, temp);

                new_index = parent_index;
                parent_index = (new_index-1)/2;
            }


            //throw new UnsupportedOperationException("Not implemented!");
        }
    }

    public Integer topValue() {
        return array.size() > 0 ? array.get(0) : null;
    }

    public String underlyingArray() {
        StringBuilder stringBuilder = new StringBuilder(array.size());
        for (int i = 0; i < array.size(); i++) {
            stringBuilder.append(array.get(i).intValue() + " ");
        }
        return stringBuilder.toString().trim();
    }
}