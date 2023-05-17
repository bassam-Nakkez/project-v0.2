package AST.ClassAndObject.Object;

import AST.Statements.Call;

public class CallObject extends Call {



    ObjectClass objectClass = null;

    public ObjectClass getObjectClass() {
        return objectClass;
    }

    public void setObjectClass(ObjectClass objectClass) {
        this.objectClass = objectClass;
    }

    @Override
    public String toString() {
        return "CallObject{"  + objectClass.toString() + "}";
    }
}
