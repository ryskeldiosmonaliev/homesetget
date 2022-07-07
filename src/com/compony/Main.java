package com.compony;

public class Main {
    public static void main(String[] args) {

        Cat cat=new Cat();

        cat.setColor("черный");
        cat.setAge(4);
        cat.setBreed("Шотландская вислоухая кошка");
        cat.setWhole(5.7);

        System.out.println("цвет кошки:"+cat.getColor());
        System.out.println("возраст кошки: "+cat.getAge());
        System.out.println("порода кошки: "+cat.getBreed());
        System.out.println("весь кошки: "+ cat.getWhole());
        System.out.println();

        Dog dog = new Dog();

        dog.setName("Рекс");
        dog.setColor("Черно-подпальный");
        dog.setAge(3);
        dog.setBreed("немецкая авчарка");

        System.out.println("цвет сабаки:"+dog.getColor());
        System.out.println("имя сабаки: "+dog.getName());
        System.out.println("порода сабаки: "+dog.getBreed());
        System.out.println("возраст сабаки: "+dog.getAge());
        System.out.println();

        Fish fish = new Fish();

        fish.setName("акуленок");
        fish.setWhole(2.3);
        fish.setView("Омуль");
        fish.setPredator(false);
        fish.setLength(64);

        System.out.println("имя рыбы: "+fish.getName());
        System.out.println("весь рыбы: "+fish.getWhole()+"кг");
        System.out.println("видь рыбы: "+fish.getView());
        System.out.println("рыба хишная? ответ: "+fish.getPredator());
        System.out.println("длина рыбы: "+fish.getLength()+"см");
        System.out.println();

        Parrot parrot = new Parrot();
        parrot.setName("Рома");
        parrot.setColor("желто-зеленый");
        parrot.setWhole(1.5);
        parrot.setAge(8);

        System.out.println("имя попугая: "+parrot.getName());
        System.out.println("цвет попугая: "+parrot.getColor());
        System.out.println("весь попугая: "+parrot.getWhole()+" кг");
        System.out.println("возраст попугая: "+parrot.getAge()+" леть");
    }
}