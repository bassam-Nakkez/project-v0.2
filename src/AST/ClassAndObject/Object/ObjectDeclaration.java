package AST.ClassAndObject.Object;

import AST.Statements.Declaration;

public class ObjectDeclaration extends Declaration {


    public String ID ;
    public ObjectClass objectClass;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public ObjectClass getObjectClass() {
        return objectClass;
    }

    public void setObjectClass(ObjectClass objectClass) {
        this.objectClass = objectClass;
    }

    @Override
    public String toString() {
        return "ObjectDeclaration{" + ID + '\n' + objectClass.toString() +  '}';
    }
}
