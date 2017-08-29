public class MyLinkedList<E> implements IMyLinkedList<E> {

    E value = null;
    MyLinkedList<E> next = null;

    /**
     * <p>Constructor.</p>
     *
     * @param e    type of linked list
     * @param next pointer to the next element
     */
    MyLinkedList(E e, MyLinkedList<E> next) {
        this.next = next;
        value = e;
    }

    @Override
    public int size() {
        MyLinkedList<E> link = this;
        int size = 0;
        while (link.next != null) {
            link = link.next;
            size++;
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size() < 1;
    }

    @Override
    public E get(int i) {
        if (i >= 0) {
            MyLinkedList<E> link = this;
            while (i > 0) {
                if (link.next == null) {
                    return null;
                } else {
                    link = link.next;
                    i--;
                }
            }
            return link.value;
        } else {
            return null;
        }
    }

    @Override
    public void set(int i, E e) {
        if (i >= 0) {
            MyLinkedList<E> link = this;
            while (i > 0) {
                if (link.next != null) {
                    link = link.next;
                    i--;
                }
            }
            link.value = e;
        }
    }

    @Override
    public void add(int i, E e) {
        if (i > 0) {
            MyLinkedList<E> link = this;
            while (i > 1) {
                if (link.next == null) {
                    link.next = new MyLinkedList<>(e, null);
                } else {
                    link = link.next;
                    i--;
                }
            }
            link.next = new MyLinkedList<>(e, link.next);
        } else if (i == 0) {
            addFirst(e);
        }
    }

    @Override
    public void addFirst(E e) {
        if (next == null)
            next = new MyLinkedList<>(value, null);
        else
            next = new MyLinkedList<>(value, next);
        value = e;
    }

    @Override
    public void addLast(E e) {
        add(size(), e);
    }

    @Override
    public E remove(int i) {
        if (i > 0) {
            MyLinkedList<E> link = this;
            while (i > 1) {
                if (link.next == null) {
                    return null;
                } else {
                    link = link.next;
                    i--;
                }
            }
            E e;
            if (link.next != null)
                e = link.next.value;
            else
                e = null;
            if (link.next != null) {
                link.next = link.next.next;
            }
            return e;
        } else if (i == 0) {
            E e = value;
            if (next != null) {
                value = next.value;
                next = next.next;
            }
            return e;
        } else {
            return null;
        }
    }

    @Override
    public E removeFirst() {
        E e = null;
        if (!isEmpty()) {
            if (size() == 0) {
                e = value;
                value = null;
                next = null;
            } else {
                e = value;
                value = next.value;
                next = next.next;
            }
        }
        return e;
    }

    @Override
    public E removeLast() {
        return remove(size() - 1);
    }

}