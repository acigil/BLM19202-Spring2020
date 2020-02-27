package LinkedList;

/**
 * @param <T> Data type
 * @file Node.java
 * @date Feb 27, 2020 , 14:03:02
 * @author Muhammet Alkan
 */
public class Node<T> {

    T data;
    Node<T> nextNode;

    public Node(T data) {
        this.data = data;
    }

}
