package kz.attractor.java;

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







      

        }

    }


