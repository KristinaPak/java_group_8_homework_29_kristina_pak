package com.company;
public class Main {

    public static void main(String[] args) {

        var cats = Cat.makeCats(10);
        Printer.print(cats);
        System.out.println("Сортировка 1: по породе кота");
        cats.sort(Cat::byBreed);
        Printer.print(cats);
        System.out.println("Сортировка 2: по имени и возрасту");
        //возраст и имя
        cats.sort(Cat::byNameAndAge);
        Printer.print(cats);
        System.out.println("Сортировка 3: убрать всех котов серго цвета");
        cats.removeIf(Cat::byColor);
        Printer.print(cats);
        System.out.println("Сортировка 4: убрать котов , длина имени которых равна 5");
        cats.removeIf(Cat::byLength);
        Printer.print(cats);
    }
}
