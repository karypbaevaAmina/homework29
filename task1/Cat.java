package kz.attractor.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

final class Cat {
    private static final Random r = new Random();
    private static final List<String> names = List.of("Peach", "Ginger", "Toby", "Seth", "Tibbles", "Tabby", "Poppy", "Millie", "Daisy", "Jasper", "Misty", "Minka");
    private final String name;
    private final int age;
    private final Breed breed;
    private final Color color;

    private Cat() {
        name = names.get(r.nextInt(names.size()));
        age = r.nextInt(10) + 1;
        breed = Breed.values()[r.nextInt(Breed.values().length)];
        color = Color.values()[r.nextInt(Color.values().length)];
    }

    public static final List<Cat> makeCats(int amount) {
        return Stream.generate(Cat::new)
                .limit(amount)
                .collect(Collectors.toList());
    }

    public final Color getColor() {
        return color;
    }

    public final String getName() {
        return name;
    }

    public final int getAge() {
        return age;
    }

    public final Breed getBreed() {
        return breed;
    }

    public boolean isNumber() {
        return name.length() == 5;
    }

    enum Color {
        TABBY, SILVER, GRAY, PEACH, GINGER, TORTIE;

        public boolean isGinger(Cat cat) {
            return cat.color == Color.GINGER;
        }
    }

    enum Breed {
        SPHINX, BRITAIN, SCOTTISH, VULGARIS, ORIENTAL
    }


    public static int byBreed(Cat e1, Cat e2) {
        return e1.breed.name().compareTo(e2.breed.name());
    }

    public static int byName(Cat e1, Cat e2) {
        return e1.name.compareTo(e2.name);
    }

    public void print() {
        System.out.printf("%s%n", breed);
    }

    public void print2() {
        System.out.printf("%s: %s%n", name, age);
    }



}













