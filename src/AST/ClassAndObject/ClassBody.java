package AST.ClassAndObject;

import java.util.ArrayList;
import java.util.List;

public class ClassBody extends ClassNode {


    public List <property> propretes = new ArrayList<>();
    public List <Method> methods = new ArrayList<>();
    public WithConstructor withConstructor = null;

    public List<property> getPropretes() {
        return propretes;
    }

    public void setPropretes(List<property> propretes) {
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
        return "ClassBody{" +
                "propretes=" + propretes +
                ", methods=" + methods +
                ", withConstructor=" + withConstructor +
                '}';
    }
}
