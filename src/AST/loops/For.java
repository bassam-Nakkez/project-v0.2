package AST.loops;

import AST.Expression.Expression;
import AST.Statements._Condition;

public class For extends Loops {

ForInitStatement forInitStatement = null;


_Condition condition = null ;
Expression expression = null;
IncrementVariable incrementVariable = null;
DecrementVariable decrementVariable = null;


    public ForInitStatement getForInitStatement() {
        return forInitStatement;
    }

    public void setForInitStatement(ForInitStatement forInitStatement) {
        this.forInitStatement = forInitStatement;
    }

    public _Condition getCondition() {
        return condition;
    }

    public void setCondition(_Condition condition) {
        this.condition = condition;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public IncrementVariable getIncrementVariable() {
        return incrementVariable;
    }

    public void setIncrementVariable(IncrementVariable incrementVariable) {
        this.incrementVariable = incrementVariable;
    }

    public DecrementVariable getDecrementVariable() {
        return decrementVariable;
    }

    public void setDecrementVariable(DecrementVariable decrementVariable) {
        this.decrementVariable = decrementVariable;
    }
}
