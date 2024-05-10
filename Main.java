package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        /*ArrayWrapper<Dog> list = new ArrayWrapper<>();
        Dog dog = new Dog("sja", 21);
        Dog dog1 = new Dog("gf", 21);
        Dog dog2 = new Dog("hht", 21);
        Dog dog3 = new Dog("fsd", 21);
        Dog dog4 = new Dog("ff4", 21);
        Dog dog5 = new Dog("psdo", 21);
        Dog dog6 = new Dog("e;rf", 21);
        Dog dog7 = new Dog("v[pfd", 21);
        Dog dog8 = new Dog("v[p;lvlf", 21);
        list.add(dog);
        list.add(dog1);
        list.add(dog2);
        list.add(dog3);
        list.add(dog4);
        list.add(dog5);
        list.add(dog6);
        list.add(dog7);
        list.get(0).ifPresentOrElse((s) -> System.out.println(dog.getAge()), () -> System.out.println("tapilmadi"));
        Optional<Dog> opt = list.remove(0);
        opt.ifPresentOrElse((d) -> System.out.println(d.getName() + " is deleted"), () -> System.out.println("silinmedi"));
        list.get(0).ifPresentOrElse((s) -> System.out.println(dog.getAge()), () -> System.out.println("tapilmadi"));
        System.out.println(list.size());
        Optional<Integer> index = list.indexOf(dog8);
        index.ifPresentOrElse((d) -> System.out.println(d), () -> System.out.println("tapilmadi"));
        System.out.println(list.contains(dog8));*/
        ArrayWrapper<Integer> list = new ArrayWrapper<>();
        list.add(4);
        list.add(3);
        list.add(6);
        list.add(7);
        list.add(5);
        System.out.println(list.sort().toString());
    }
}
