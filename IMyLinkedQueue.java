public interface IMyLinkedQueue<E> {

    /**
     * <p>Returns size of queue.</p>
     *
     * @return integer size of queue
     */
    int size();

    /**
     * <p>Returns whether queue is empty or not.</p>
     *
     * @return boolean whether queue is empty or not
     */
    boolean isEmpty();

    /**
     * <p>Returns first element of queue and removes it from the front.</p>
     *
     * @return E removed element
     */
    E dequeue();

    /**
     * <p>Inserts element at the rear of queue.</p>
     *
     * @param e element for insertion
     */
    void enqueue(E e);

    /**
     * <p>Returns first element of queue.</p>
     *
     * @return E first queue's element
     */
    E first();

}
