import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.lang.Exception;

public class LinkedList<T> implements List<T> {
    private Node<T> head;
    private int size;
    public LinkedList()
    {
       head = new Node<>();
        this.size=0;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void addToFront(T data) {
       Node<T> newHead = new Node<>();
       newHead.setData(data);
       newHead.setNextNode(head);
       head = newHead;
        size++;

    }

    public Node<T> getHead() {
        return head;
    }

    @Override
    public T removeFirst() throws EmptyListException {

        if(size ==0)
        {
            throw new EmptyListException();
        }
        T data = head.getData();
        head.setData(head.getNextNode().getData());
        head.setNextNode(head.getNextNode().getNextNode());
        size--;
        return data;
    }
}
