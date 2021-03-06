package io.hauer.demo;

import java.util.List;

public class DuckApp {
    private static final List<Duck> DUCKS = List.of(new Duck("Trick", new Stomach()), new Duck("Track", new Stomach()),
            new Duck("Daisy", new Stomach()));

    public static void main(String[] args) {
        for (Duck duck : DUCKS) {
            duck.eat(FoodSupply.getNext());
            print(duck);
        }
    }

    private static void print(final Duck duck) {
        System.out.println(duck);
    }
}
