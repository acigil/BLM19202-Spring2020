package Generics;

/**
 * @file BoxGeneric.java
 * @date Feb 13, 2020 , 15:47:49
 * @author Muhammet Alkan
 */
public class BoxGeneric<T> {

    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void main(String[] args) {
        BoxGeneric<Integer> integerBox = new BoxGeneric<>();
        //BoxGeneric<String> stringBox = new BoxGeneric<String>();

        integerBox.add(10);
        //stringBox.add(new String("Hello World"));

        Integer someInteger = integerBox.get();
        System.out.println(someInteger);
    }
}