public interface IMyLinkedList<E> {

    /**
     * <p>Returns size of linked list.</p>
     *
     * @return integer size of liked list
     */
    int size();

    /**
     * <p>Returns whether list is empty or not.</p>
     *
     * @return boolean whether list is empty or not
     */
    boolean isEmpty();

    /**
     * <p>Returns value of element.</p>
     *
     * @param i position in the list
     * @return E value of element in position i
     */
    E get(int i);

    /**
     * <p>Sets value of element.</p>
     *
     * @param i position in the list
     * @param e new value
     */
    void set(int i, E e);

    /**
     * <p>Adds element to the position i.</p>
     *
     * @param i position in the list
     * @param e value of element
     */
    void add(int i, E e);

    /**
     * <p>Adds element to the first position of the list.</p>
     *
     * @param e value of element
     */
    void addFirst(E e);

    /**
     * <p>Adds element to the last position of the list.</p>
     *
     * @param e value of element
     */
    void addLast(E e);

    /**
     * <p>Removes element from the i position.</p>
     *
     * @param i position of element
     */
    E remove(int i);

    /**
     * <p>Removes element from the first position.</p>
     */
    E removeFirst();

    /**
     * <p>Removes element from the last position.</p>
     */
    E removeLast();

}
