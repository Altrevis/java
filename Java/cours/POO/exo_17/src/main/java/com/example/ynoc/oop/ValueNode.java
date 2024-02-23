package com.example.ynoc.oop;

public class ValueNode extends Node {
    private int value;

    public ValueNode(int value) {
        this.value = value;
    }

    @Override
    public int calculate() {
        return value;
    }

    @Override
    public void print() {
        System.out.print(value);
    }
}
