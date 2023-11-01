public final class ArrayBag<T> implements BagInterface<T>{

    private final T[] bag;
    private int numberOfEntries;
    private static final int DEFAULT_CAPACITY = 25;
    private boolean integrityOK;
    private static final int MAX_CAPACITY = 10000;

    /**
     * Creates an empty bag whose initial capacity is 25
     */
    public ArrayBag(){
        this(DEFAULT_CAPACITY);
    }

    /**
     * Creates an empty bag having a given initial capacity
     * @param desiredCapacity The integer capacity desired
     */
    public ArrayBag(int desiredCapacity)  {
        if(desiredCapacity <= MAX_CAPACITY) {


            //The cast is safe because the new array contains null entries
            @SuppressWarnings("unchecked")
            T[] tempBag = (T[]) new Object[desiredCapacity];//Unchecked cast
            bag = tempBag;
            numberOfEntries = 0;
        }
        else {
            throw new IllegalStateException("Attempt to create a bag whose" +
                    "capacity exceeds allowed maximum");
        }

    }

    @Override
    public int getCurrentSize() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    private void checkIntegrity(){
        if(!integrityOK)
            throw new SecurityException("ArrayBag object is corrupt");
    }

    /**
     * Adds a new entry to this bag
     * @param newEntry The object to be added as a new entry
     * @return True if the addition is successufl, or false if not
     */
    @Override
    public boolean add(T newEntry) {

        checkIntegrity();
        boolean result = true;

        if(isArrayFull()){
            result = false;
        }
        else {
            //Assertion: result is true here
            bag[numberOfEntries] = newEntry;
            numberOfEntries++;
        }
        return result;
    }

    /**
     * Returns true if the bag is full, or false if not
     * @return Returns true if the bag is full, or false if not
     */
    private boolean isArrayFull() {
        return numberOfEntries >= bag.length;
    }

    @Override
    public T remove() {
        return null;
    }

    @Override
    public boolean remove(T anEntry) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public int getFrequencyOf(T anEntry) {
        return 0;
    }

    @Override
    public boolean contains(T anEntry) {
        return false;
    }

    /**
     * Retrieves all entries that are in this bag
     * @return A newly allocated array of all the entries in the bag
     */
    @Override
    public T[] toArray() {
        //The cast is safe because the new array contains null entries
        @SuppressWarnings("unchecked")
                T[] result = (T[])new Object[numberOfEntries]; //Unchcked cast
        for (int i = 0; i < numberOfEntries; i++) {
            result[i] = bag[i];

        }
        return result;

    }
}