package AST.ClassAndObject.Class;

import java.util.ArrayList;
import java.util.List;

public class ClassBody extends ClassNode {


    public List <Property> propretes = new ArrayList<>();
    public List <Method> methods = new ArrayList<>();
    public WithConstructor withConstructor = null;

    public List<Property> getPropretes() {
        return propretes;
    }

    public void setPropretes(List<Property> propretes) {
        this.propretes = propretes;
    }

    public List<Method> getMethods() {
        return methods;
    }

    public void setMethods(List<Method> methods) {
        this.methods = methods;
    }

    public WithConstructor getWithConstructor() {
        return withConstructor;
    }

    public void setWithConstructor(WithConstructor withConstructor) {
        this.withConstructor = withConstructor;
    }

    @Override
    public String toString() {

        String str =  "ClassBody { ";
        for(Property e : this.propretes )
        {

            str = str + "\n" + e.toString() ;
        }
        for(Method e : this.methods )
        {

            str = str + "\n" + e.toString() ;
        }


        return str + withConstructor.toString() + "}" ;





    }


    }

