package AST.ClassAndObject.Class;

import AST.Statements.Call;

public class This {



    Call call = null;
    String ID ;

    public Call getCall() {
        return call;
    }

    public void setCall(Call call) {
        this.call = call;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "This{" + call.toString() + ID + "}";
    }
}
