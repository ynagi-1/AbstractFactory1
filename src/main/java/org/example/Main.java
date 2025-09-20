package org.example;

public class Main {
    public static void main(String[] args) {
        AbstractFactory factoryChocolote = new ChocolateFactory();
        AbstractFactory factoryStrawberry = new StrawberryFactory();

        factoryStrawberry.getMilk().printName();
        factoryStrawberry.getDonut().printName();
        System.out.println();

        factoryChocolote.getDonut().printName();
        factoryChocolote.getMilk().printName();

    }

}