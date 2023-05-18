package AST.Statements;

import AST.DataType.Boolean;
import AST.Operators.ComparsionOperator;
import AST.Operators.LogicalOperator;

public class _Condition {

    ComparsionOperator comparison = null;
    LogicalOperator logicalOperator = null ;
    Boolean bool;
    String id;
    Call call = null;


    public LogicalOperator getLogicalOperator() {
        return logicalOperator;
    }

    public void setLogicalOperator(LogicalOperator logicalOperator) {
        this.logicalOperator = logicalOperator;
    }

    public Boolean getBool() {
        return bool;
    }

    public void setBool(Boolean bool) {
        this.bool = bool;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Call getCall() {
        return call;
    }

    public void setCall(Call call) {
        this.call = call;
    }

    public ComparsionOperator getComparison() {
        return comparison;
    }

    public void setComparison(ComparsionOperator comparison) {
        this.comparison = comparison;
    }






    public String toString() {

        if (this.logicalOperator != null) {
            return "Condition : { " + this.logicalOperator.toString() + " }";
        }

        else if(this.comparison != null) {
            return "Condition : { " + this.comparison.toString() + " }";
        }

        else if (this.bool != null) {
            return "Condition : { " + this.bool.toString() + " }";
        }

        else if (this.call!= null) {
            return "Condition : { " + this.call.toString() + " }";
        }

        else {
            return "Condition : { " + this.id+ " }";

        }
    }


}
