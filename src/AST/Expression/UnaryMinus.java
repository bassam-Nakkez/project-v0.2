package AST.Expression;

public class UnaryMinus extends Expression {


    Expression expression ;


    @Override
    public String toString() {
        return "UnaryMinus{"+ " -("+ expression.toString() + ") }";
    }
}
