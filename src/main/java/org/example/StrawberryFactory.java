package org.example;

public class StrawberryFactory implements AbstractFactory {
    @Override
    public Donut getDonut() {
        return new StrawberryDonut();
    }
    @Override
    public Milk getMilk() {
        return new StrawberryMilk();
    }
}