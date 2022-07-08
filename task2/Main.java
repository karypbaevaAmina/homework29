package kz.attractor.java;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        var cat = new ActiveCat(String::new);



        Action a1 =() -> "I lying";
        Action a2 = ()-> " I drink";
        Action a3 =()-> "I play";

        ArrayList<ActiveCat>cats = new ArrayList<>();
        cats.add(new ActiveCat(a1));
        cats.add(new ActiveCat(a2));
        cats.add(new ActiveCat(a3));

        cats.forEach(ActiveCat::doAction);
    }
}
