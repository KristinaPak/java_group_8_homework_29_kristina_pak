package com.company;

import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        var cats = new ArrayList<ActiveCat>();
        cats.add(new ActiveCat());
        cats.add(new ActiveCat(ActiveCat.sleep()));
        cats.add(new ActiveCat(ActiveCat.eat()));
        cats.add(new ActiveCat(ActiveCat.play()));
        cats.add(new ActiveCat(ActiveCat.drink()));

        cats.forEach(ActiveCat::doAction);
    }


}