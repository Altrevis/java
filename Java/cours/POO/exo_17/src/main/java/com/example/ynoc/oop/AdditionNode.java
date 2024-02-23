package com.example.ynoc.oop;

public class AdditionNode extends Node {
    private Node left;
    private Node right;

    public AdditionNode(Node left, Node right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int calculate() {
        return left.calculate() + right.calculate();
    }

    @Override
    public void print() {
        System.out.print("(");
        left.print();
        System.out.print(" + ");
        right.print();
        System.out.print(")");
    }
}