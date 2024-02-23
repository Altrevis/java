package com.example.ynoc.oop;

public class DoubleNode extends Node {
    private Node operand;

    public DoubleNode(Node operand) {
        this.operand = operand;
    }

    @Override
    public int calculate() {
        return operand.calculate() * 2;
    }

    @Override
    public void print() {
        System.out.print("(2 * ");
        operand.print();
        System.out.print(")");
    }
}