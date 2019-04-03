public interface OrderedList {

    String toString();

    int size();
    
    // Remove int at index and shifts elements and returns the removed int
    int remove(int index);

    // Return the int at index
    int get(int index);

    // Insert at index
    boolean add(int num);

}
