package LinkedList;

/**
 * @file Test.java
 * @date Feb 27, 2020 , 14:45:33
 * @author Muhammet Alkan
 */
public class Test {

    public static void main(String[] args) {
        LinkedList<Integer> liste = new LinkedList<>();

        liste.addFirst(5);
        liste.addLast(3);
        liste.addAfter(2, 7);
        liste.addFirst(8);
        liste.addAfter(3, 6);

        liste.print();
        System.out.println("size : " + liste.size());

        liste.remove(6);
        liste.print();
        System.out.println("size : " + liste.size());
    }
}
