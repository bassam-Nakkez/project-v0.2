package AST.Operators;

public class LessEqual extends ComparsionOperator {







    @Override
    public String toString() {
        return " LessEqual{" + left.toString()+ " <= " + right.toString() + '}';
    }
}
