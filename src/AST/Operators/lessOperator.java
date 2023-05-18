package AST.Operators;

public class lessOperator extends ComparsionOperator {




    public String toString() {
        return " lessOperator{" + left.toString()+ " < " + right.toString() + '}';
    }
}
