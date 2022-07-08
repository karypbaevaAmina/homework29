package kz.attractor.java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Main1 {

    public static void main(String[] args) {

        var cats = Cat.makeCats(10);
        Printer.print(cats);

        cats.sort(Cat::byBreed);   // по породе
        cats.forEach(cat -> cat.print());
        System.out.println();

        cats.sort(Cat::byName); // по имени и age
        Comparator cmp = Comparator.comparingInt(Cat::getAge);
        cats.sort(cmp);
        cats.forEach(cat -> cat.print2());


        System.out.println("\nRemove from the list of all GINGER cats.");
        var list = Cat.Color.GINGER;
        cats.removeIf(list::isGinger); //удалить из списка всех котов цвета GINGER
        Printer.print(cats);

        System.out.println("Remove from the list all cats whose name length is 5.");
        cats.removeIf(Cat::isNumber);// УУдалять из списка всех котов, длина имени которого равна 5.
        Printer.print(cats);



    }

}


