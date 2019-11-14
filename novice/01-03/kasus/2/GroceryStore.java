package org.teckhooi.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * java -ea to enable assert otherwise AssertionError will not be thrown with
 * false assertion.
 * 
 * To compile,
 * javac -d classes src/org/teckhooi/generics/GroceryStore.java
 * 
 * To execute,
 * java -ea -cp classes org.teckhooi.generics.GroceryStore
 *   
 * @author Lim, Teck Hooi
 *   
 */
public class GroceryStore {
    static class Plant { // class plant
        private String name;

        public Plant(String name) { //fungsi input string untuk var name
            this.name = name;
        }

        public String getName() { //fungsi call dengan return value var name
            return name;
        }
    }

    static class Fruit extends Plant { //class extend dari class plant
        private int size;

        public Fruit(String name, int size) { //fungsi input untuk name dan size
            super(name); //set var name dari class plant
            this.size = size; //set var name dari class ini fruit
        }

        public int getSize() { //fungsi call return value size
            return size;
        }
    }

    static class Apple extends Fruit { //class extend dari fruit
        private String origin;

        public Apple(String name, int size, String origin) { //fungsi input untuk var name size dan origin
            super(name, size); // set var size ke fruit , dimana di fruit name dinput ke var plant
            this.origin = origin;
        }

        public String getOrigin() {
            return origin;
        }
    }

    public static void main(String[] args) {
        GroceryStore store = new GroceryStore(); //bikin instance baru dari clas grocerystore
        List<? super Fruit> fruitsBasket = new ArrayList<>(); //bikin list dengan jenis isi fruit
        store.fill(fruitsBasket); //panggil funsi fill dari class grocerystore

        assert(fruitsBasket.size() == 3); //

        List<Apple> anotherBasket = new ArrayList<>(); //bikin list dengan jenis isi apple
        anotherBasket.add(new Apple("apple", 5, "US")); // add apple to list
        anotherBasket.add(new Apple("apple", 8, "UK"));
        anotherBasket.add(new Apple("apple", 9, "CN"));

        assert(store.getBiggestFruit(anotherBasket).getSize() == 9);
    }

    public void fill(List<? super Fruit> fruitsBasket) {
        fruitsBasket.add(new Apple("apple", 5, "US"));
        fruitsBasket.add(new Apple("apple", 8, "UK"));
        fruitsBasket.add(new Apple("apple", 9, "CN"));

        // Note : This statement compiles because it didn't assign an
        // instant to a variable or return it to the caller as shown below.
        // 
        // fruitsBasket.get(0); // compiles OK
        // Fruit apple = fruitsBasket.get(0);   // compilation error
        //
        // return fruitsBasket.get(0);   // compilation error 
    }

    /**
     * This method accepts List<? extends Fruit> instead of List<Apple> to allow 
     * classes that extend from Fruit to be used as input. 
     *
     * Note : List<Apple> is not a child of List<Fruit> though Apple inherits 
     * from Fruit. It just does not work this way.
     */
    public Fruit getBiggestFruit(List<? extends Fruit> fruits) {
        // Note: This statement is here to highlight that "? extends T" 
        // cannot "consume" new instances. Remember PECS rule.
        // fruits.add(new Apple("apple", 9, "CN"));  // compilation error

        assert(!fruits.isEmpty());
        int len = fruits.size();
        Fruit biggestFruit = fruits.get(0);
        for (int i = 1; i < len; i++) {
            if (fruits.get(i).getSize() > biggestFruit.getSize()) {
                biggestFruit = fruits.get(i);
            }    
        }
        return biggestFruit;
    }
}
