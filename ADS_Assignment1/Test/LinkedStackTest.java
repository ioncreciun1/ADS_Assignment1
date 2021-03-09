import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

class LinkedStackTest {
    LinkedStack<String> stack;

    @BeforeEach
    void setUp() {
        stack = new LinkedStack<>();
    }

    @Test
    void isEmpty()
    {
        assertEquals(true,stack.isEmpty());
    }
    @Test
    void isNotEmpty()
    {
        stack.push("hey");
        assertEquals(false,stack.isEmpty());
    }

    @Test
    void pushOne() throws EmptyStackException {
        stack.push("one");
        assertEquals("one",stack.pop());
    }

    @Test
    void pushMany()
    {
        stack.push("one");
        stack.push("Many");
        assertEquals("Many",stack.pop());
    }

    @Test
    void pop() {
        assertThrows(EmptyStackException.class,()->{
            stack.pop();
        });
    }
}