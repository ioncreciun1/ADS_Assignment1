import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    private LinkedList<String> linkedList;

    @BeforeEach
    void setUp()
    {
        linkedList = new LinkedList<>();

    }

    @Test
    void isEmpty() {
        assertEquals(0,linkedList.size());
    }



    @Test
    void SizeOne()
    {
        linkedList.addToFront("first");
        assertEquals(1,linkedList.size());

    }

    @Test
    void SizeMultiple()
    {
        linkedList.addToFront("first");
        linkedList.addToFront("second");
        linkedList.addToFront("third");
        assertEquals(3,linkedList.size());
    }

    @Test
    void addOneToFront() {
        linkedList.addToFront("first");
        assertEquals("first",linkedList.getHead().getData());
    }

    @Test
    void addTwoToFront() {
        linkedList.addToFront("first");
        linkedList.addToFront("Second");
        assertEquals("Second",linkedList.getHead().getData());
    }

    @Test
    void getHead() {
        linkedList.addToFront("first");
        assertEquals("first",linkedList.getHead().getData());
    }

    @Test
    void getNullHead()
    {
        assertNull(linkedList.getHead());
    }

    @Test
    void removeFirstOne() throws EmptyListException {
        linkedList.addToFront("first");
        assertEquals("first",linkedList.removeFirst());
    }

    @Test
    void removeFirstTwo() throws EmptyListException {
        linkedList.addToFront("first");
        linkedList.addToFront("Second");
        assertEquals("Second",linkedList.removeFirst());
    }

    @Test
    void removeFirstException() throws EmptyListException {
        assertThrows(EmptyListException.class,()->{
            linkedList.removeFirst();
        });
    }

}