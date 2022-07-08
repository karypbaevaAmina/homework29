package kz.attractor.java;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public final class ActiveCat {
    private static final Random r = new Random();
    private static final List<String> names = List.of("Peach", "Ginger", "Toby", "Seth", "Tibbles", "Tabby", "Poppy", "Millie", "Daisy", "Jasper", "Misty", "Minka");
    private final String name;
    private Action action;

    public ActiveCat(Action action) {
        name = names.get(r.nextInt(names.size()));
        this.action = action;
    }

    public final String getName() {
        return name;
    }
    public void doAction() {
        System.out.printf("I'm %s. %s%n", name, action.perform());
    }

    public static String jump() {
        return "I'm jumping";
    }

    public static String sleep() {
        return "i sleep";
    }

    public static String eat() {
        return "I'm eating";
    }


}

