package AST.ClassAndObject.Class;

import AST.Statements.Declaration;

public class ClassDeclaration extends Declaration {


  public boolean isAbstract = false;
  public String ClassName;
  public SuperClass superClass = null;
  public Interfaces anInterfaces = null;
  public ClassBody classBody;


  public boolean isAbstract() {
    return isAbstract;
  }

  public void setAbstract(boolean anAbstract) {
    isAbstract = anAbstract;
  }

  public String getClassName() {
    return ClassName;
  }

  public void setClassName(String className) {
    ClassName = className;
  }

  public SuperClass getSuperClass() {
    return superClass;
  }

  public void setSuperClass(SuperClass superClass) {
    this.superClass = superClass;
  }

  public Interfaces getAnInterfaces() {
    return anInterfaces;
  }

  public void setAnInterfaces(Interfaces anInterfaces) {
    this.anInterfaces = anInterfaces;
  }

  public ClassBody getClassBody() {
    return classBody;
  }

  public void setClassBody(ClassBody classBody) {
    this.classBody = classBody;
  }

  @Override
  public String toString() {
//    if(isAbstract = true){
//      return "\nClassDeclaration{  abstract : true" + ClassName + '\'' + superClass.toString() + anInterfaces.toString() + classBody.toString() +
//              '}';
//    }
//    else  return "\nClassDeclaration{  abstract : false" + ClassName + '\'' + superClass.toString() + anInterfaces.toString() + classBody.toString() +
//            '}';
//


    if (isAbstract() == false && ClassName != null && superClass == null && anInterfaces == null && classBody == null) {
      return "ClassDeclaration{" + "public" + "class " + ClassName + "}";
    }
    if (isAbstract() == false && ClassName != null && superClass != null && anInterfaces == null && classBody == null) {
      return "ClassDeclaration{" + "public" + "class " + ClassName + "extends" + superClass.toString() + "}";
    }
    if (isAbstract() == false && ClassName != null && superClass != null && anInterfaces != null && classBody == null) {
      return "ClassDeclaration{" + "public" + "class " + ClassName + "extends" + superClass.toString() + "implements" + anInterfaces.toString() + "}";
    }
    if (isAbstract() == false && ClassName != null && superClass == null && anInterfaces != null && classBody == null) {
      return "ClassDeclaration{" + "public" + "class " + ClassName + "implements" + anInterfaces.toString() + "}";
    }
    if (isAbstract() == false && ClassName != null && superClass == null && anInterfaces == null && classBody != null) {
      return "ClassDeclaration{" + "public" + "class " + ClassName + "\n" + classBody.toString() + "}";
    }
    if (isAbstract() == false && ClassName != null && superClass != null && anInterfaces == null && classBody != null) {
      return "ClassDeclaration{" + "public" + "class " + ClassName + "extends" + superClass.toString() + "\n" + classBody.toString() + "}";
    }
    if (isAbstract() == false && ClassName != null && superClass != null && anInterfaces != null && classBody != null) {
      return "ClassDeclaration{" + "public" + "class " + ClassName + "extends" + superClass.toString() + "implements" + anInterfaces.toString() + "\n" + classBody.toString() + "}";
    }
    if (isAbstract() == false && ClassName != null && superClass == null && anInterfaces != null && classBody != null) {
      return "ClassDeclaration{" + "public" + "class " + ClassName + "implements" + anInterfaces.toString() + "\n" + classBody.toString() + "}";
    }
//              "isAbstract=" + isAbstract +
//              ", ClassName='" + ClassName + '\'' +
//              ", superClass=" + superClass +
//              ", anInterfaces=" + anInterfaces +
//              ", classBody=" + classBody +
//              '}';

    return "ClassDeclaration{" + "Error : please enter class name";
  }


  }
