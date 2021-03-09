import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    @org.junit.jupiter.api.Test
    void setData()
    {

        Operand operand = new Operand();

        operand.setValue(5);
        Node node = new Node(operand);
        node.setData(5);
        assertEquals("5",node.getData().toString());
    }
    @org.junit.jupiter.api.Test
    void resetData()
    {


        Operand operand = new Operand();
        operand.setValue(5);
        Node node = new Node(operand);
        node.setData(5);
        operand.setValue(6);
        node.setData(6);
        assertEquals("6",node.getData().toString());
    }

    @org.junit.jupiter.api.Test
    void getDataWhenProvidedValue()
    {

        Operand operand = new Operand();
        operand.setValue(3);
        Node node = new Node(operand);
        node.setData(3);
        assertEquals("3",node.getData().toString());
    }


    @org.junit.jupiter.api.Test
    void setNextNode()
    {

        Operand operand = new Operand();
        operand.setValue(3);
        Node node = new Node(operand);
        node.setData(3);
        Operand operand1 = new Operand();
        operand1.setValue(5);
        Node node1 = new Node(operand1);
        node.setNextNode(node1);
        assertEquals(operand1,node.getNextNode().getData());
    }

    @org.junit.jupiter.api.Test
    void getNextNode()
    {
        Operand operand = new Operand();
        operand.setValue(3);
        Node node = new Node(operand);
        Operand operand1 = new Operand();
        operand1.setValue(5);
        node.setNextNode(new Node(operand1));
        assertEquals(operand1,node.getNextNode().getData());
    }
}