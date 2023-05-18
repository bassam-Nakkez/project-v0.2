package AST.Operators;

public  class NotEqual extends ComparsionOperator {


    public String toString() {
        return " NotEqual{" + left.toString()+ " != " + right.toString() + '}';
    }


}
