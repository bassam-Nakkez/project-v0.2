package AST.ClassAndObject.Class;


public class DefConstructor {



    String name;
    MethodBody methodBody = null ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MethodBody getMethodBody() {
        return methodBody;
    }

    public void setMethodBody(MethodBody methodBody) {
        this.methodBody = methodBody;
    }

    @Override
    public String toString() {
        return "\n DefConstructor{"+ name + '\'' + methodBody.toString()+ "}";
    }
}
