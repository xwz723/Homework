/**
 * An object meant to wrap and sort an array of Comparable objects.
 *
 * Subclasses should provide implementations of the sortArray() method.
 *
 * @author Matt (swap method written by Tyler Smith)
 * @version 1.1 (Tyler Smith: 15 April, 2014; 12:40 AM)
 */
public abstract class AbstractSorter {

    protected Comparable[] array;

    /**
     * Constructs a new Sorter, wrapping the given Comparable array.
     *
     * @param Comparable[] the array we will sort
     */
    public AbstractSorter(Comparable[] arr) {
        this.array = arr;
    }

    /**
     * Sorts the array stored in the instance variable array.
     */
    public abstract void sortArray();

    /**
     * Returns the array in whatever state it is presently in.
     */
    public Comparable[] getArray() {
        return array;
    }

    /**
     * Swaps the elements of the array at the indicated indices.
     *
     * @param first - the index of the first element
     * @param second - the index of the second element
     */
    protected void swap(int first, int second) {
        Comparable temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
