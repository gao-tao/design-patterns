package com.design.pattern.visitor.example;

import java.util.Random;

/**
 * 经理
 */
public class Manager extends Employee{

    public Manager(String name) {
        super(name);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    public int getProducts(){
        return new Random().nextInt(10);
    }
}
