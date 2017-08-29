public class MyLinkedQueue<E> implements IMyLinkedQueue<E> {

    private MyLinkedList<E> list = new MyLinkedList<>(null, null);

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public E dequeue() {
        E e = list.get(0);
        list.removeFirst();
        return e;
    }

    @Override
    public void enqueue(E e) {
        list.addLast(e);
    }

    @Override
    public E first() {
        return list.get(0);
    }

}
