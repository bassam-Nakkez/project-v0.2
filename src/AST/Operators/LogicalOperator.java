package AST.Operators;

public  class LogicalOperator extends  Operator {

    LogicalOperator left;
    LogicalOperator right;
    String ID ;
    Boolean boolValue;
    ComparsionOperator comp;
    String operator;




    public LogicalOperator getLeft() {
        return left;
    }

    public void setLeft(LogicalOperator left) {
        this.left = left;
    }

    public LogicalOperator getRight() {
        return right;
    }

    public void setRight(LogicalOperator right) {
        this.right = right;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Boolean getBoolValue() {
        return boolValue;
    }

    public void setBoolValue(Boolean boolValue) {
        this.boolValue = boolValue;
    }

    public ComparsionOperator getComp() {
        return comp;
    }

    public void setComp(ComparsionOperator comp) {
        this.comp = comp;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }


    @Override
    public String toString() {

        if (this.left != null) {

            if (this.right != null) {
                return "(" + this.left.toString() + " " + this.operator+ " " + this.right.toString() + ")";
            } else if (this.comp.toString() != null) {
                return "(" + this.left.toString() + " " + this.operator + " " + this.comp.toString() + ")";
            } else if (this.ID != null) {
                return "(" + this.left.toString() + " " + this.operator + " " + this.ID.toString() + ")";
            } else {
                return "(" + this.left.toString() + " " + this.operator + " " + this.boolValue.toString() + ")";
            }


        } else if (this.right != null) {

                if (this.comp != null) {
                    return "(" + this.comp.toString() + " " + this.operator + " " + this.right.toString() + ")";
                } else if (this.ID != null) {
                    return "(" + this.ID + " " + this.operator + " " + this.right.toString() + ")";
                } else {
                    return "(" + this.boolValue.toString() + " " + this.operator + " " + this.right.toString() + ")";
                }
        }
        else if(this.comp != null )
        {
            return "(" + this.comp.toString() + ")";

        }
        else if (ID !=null)
        {
            return  this.ID;
        }
        else return boolValue.toString();
    }
}
