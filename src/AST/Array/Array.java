package AST.Array;

import AST.Node;

public abstract class Array extends Node {
    decArray decArray;
    decpartArray right;
    ArrayBody left;


    public decArray getDecArray() {
        return decArray;
    }

    public void setDecArray(decArray decArray) {
        this.decArray = decArray;
    }

    public decpartArray getRight() {
        return right;
    }

    public void setRight(decpartArray right) {
        this.right = right;
    }

    public ArrayBody getLeft() {
        return left;
    }

    public void setLeft(ArrayBody left) {
        this.left = left;
    }
}

