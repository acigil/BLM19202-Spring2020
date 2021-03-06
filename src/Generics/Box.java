package Generics;

/**
 * @file Box.java
 * @date Feb 13, 2020 , 15:33:47
 * @author Muhammet Alkan
 */
public class Box {

    private Object object;

    public Object get() {
        return object;
    }

    public void add(Object object) {
        this.object = object;
    }

    public static void main(String[] args) {
        Box integerBox = new Box();

        //integerBox.add(new Integer(10));
        integerBox.add(new String("10"));

        Integer someInteger = (Integer) integerBox.get();
        System.out.println(someInteger);
    }
}