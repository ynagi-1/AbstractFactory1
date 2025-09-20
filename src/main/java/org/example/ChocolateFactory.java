package org.example;

public class ChocolateFactory implements AbstractFactory {
    @Override
    public Donut getDonut() {
        return new ChocolateDonut();
    }
    @Override
    public Milk getMilk() {
        return new ChocolateMilk();
    }
}
