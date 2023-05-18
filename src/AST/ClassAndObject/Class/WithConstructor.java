package AST.ClassAndObject.Class;

import java.util.ArrayList;
import java.util.List;

public class WithConstructor {



    List<Property> properties = new ArrayList<>();
    List<Method> methods = new ArrayList<>();
    Constructor constructor = null;
    DefConstructor defConstructor = null;


    public List<Property> getProperties() {
        return properties;
    }

    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }

    public List<Method> getMethods() {
        return methods;
    }

    public void setMethods(List<Method> methods) {
        this.methods = methods;
    }

    public Constructor getConstructor() {
        return constructor;
    }

    public void setConstructor(Constructor constructor) {
        this.constructor = constructor;
    }

    public DefConstructor getDefConstructor() {
        return defConstructor;
    }

    public void setDefConstructor(DefConstructor defConstructor) {
        this.defConstructor = defConstructor;
    }

    @Override
    public String toString() {
        String str = " WithConstructor{ ";
        for (Property e : this.properties) {

            str = str + "\n" + e.toString();
        }
        for (Method e : this.methods) {

            str = str + "\n" + e.toString();
        }


        return  str + constructor.toString() + "\n" + defConstructor.toString() + "}";

    }





}
