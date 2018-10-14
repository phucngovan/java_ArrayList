import java.util.Arrays;

public class MyList<E> {
    int size=0;
    private static final int DEFAUNT_CAPACITY=10;
    Object[] elements;
    public MyList() {
        elements=new Object[DEFAUNT_CAPACITY];

    }
    public MyList(int capacity) {
        elements=new Object[capacity];
    }

    public void ensureCapacity(int minCapacity) {
        while (minCapacity>= elements.length) {
            elements = Arrays.copyOf(elements, elements.length*2);
        }
    }
    public void add(int index,E element){
        if (index>= elements.length) {
            ensureCapacity(index);
        }
//        for (int i = size; i > index; i--) {
//            elements[i] = elements[i-1];
//        }
        elements[index] = element;
        size++;
    }

    public boolean add (E element) {
        for (int i=0;i<size;i++) {
            if(elements[i]==null) {
                elements[i]=element;
                size++;
                return true;
            }
        }
        return false;

    }

    public void remove(int index) {
        if (index>=0 && index<size) {
            for (int i = index; i < size; i++) {
                elements[i]=elements[i+1];
            }
            size--;
        }

    }
    public int size(){
        return size;
    }
    public MyList clone(){
        return this;
    }
    public boolean contains(E element) {
        for (int i = 0; i < size ; i++) {
            if (elements[i] == element) {
                return true;
            }
        }
        return false;
    }
    public int indexOf(E element) {
        for (int i=0;i<size;i++) {
            if (elements[i]==element) {
                return i;
            }

        } return -1;
    }

    public E get(int index) {
        return (E) elements[index];

    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        };
    }


    public void printList() {
        System.out.println("My list :");
        for (int i = 0; i < size ; i++) {
            System.out.println(elements[i]);
        }
    }
}
