package Visitor;

import AST.*;
import AST.Call.CallFunction;
import AST.ClassAndObject.Class.*;
import AST.ClassAndObject.Object.*;
import AST.Expression.*;
import AST.Expression.Addition.Addition;
import AST.Expression.Division.Division;
import AST.Expression.Multiplication.Multiplication;
import AST.Operators.*;
import AST.Statements.Call;
import AST.Statements.Declaration;
import AST.Statements.Statement;
import AST.Widget.*;
import SymbolTableSructure.*;
import SymbolTableSructure._Class;
import alter.DartParser;
import alter.DartParserBaseVisitor;
import org.antlr.v4.runtime.Token;


import java.util.ArrayList;
import java.util.List;

public class MyVisitor extends DartParserBaseVisitor {


    @Override
    public Parse visitParse(DartParser.ParseContext ctx) {
        Parse parse = new Parse();
        parse.setBlock(visitBlock(ctx.block()));
        return parse;
    }


    @Override
    public Block visitBlock(DartParser.BlockContext ctx) {
        Block block =new Block();

        for (int i = 0 ; i< ctx.stat().size(); i++)
        {
            block.getStatements().add(visitStat(ctx.stat().get(i)));
        }
        return block;
    }

    @Override
    public Statement visitStat(DartParser.StatContext ctx) {
        if(ctx.call() != null)
        {
            return  visitCall(ctx.call());
        }
        else
            if (ctx.declaration() != null )
        {
            return visitDeclaration(ctx.declaration());
        }


//        else if (ctx.assignment() != null)
//        {
//            return visitAssignment(ctx.assignment());
//        }
//        else if (ctx.if_stat() != null)
//        {
//            return visitIf_stat(ctx.if_stat());
//        }
//        else if (ctx.loops() != null)
//        {
//            return visitLoops(ctx.loops());
//        }
//        else if (ctx.switch_stat() != null)
//        {
//            return visitSwitch_stat(ctx.switch_stat());
//        }
        else
            if ( ctx.imports() != null )
        {
            for (int i = 0 ; i< ctx.imports().size(); i++)
            {
                Imports imports = new Imports();
                imports.getImports().add(visitImports(ctx.imports().get(i)));
                return imports;
            }
        }

            if(ctx.widget() != null)
            {
                return visitWidget(ctx.widget());
            }
        return null;

    }

    @Override
    public String visitImports(DartParser.ImportsContext ctx) {

        String string = ctx.STRING_singl().getText();

        return  string;
    }


    //------------------------<<  CAll >>------------

    @Override
    public Call visitCall(DartParser.CallContext ctx) {

        if (ctx.objectMethod() != null) {
            return visitObjectMethod(ctx.objectMethod());
        }
        if (ctx.objectClass() != null) {

            return visitObjectClass(ctx.objectClass());
        }
        if (ctx.callFunction() != null) {

            return visitCallFunction(ctx.callFunction());
        }
        if (ctx.objectProperty() != null) {
            return visitObjectProperty(ctx.objectProperty());

        }

        if (ctx.callObject() != null) {
            return visitCallObject(ctx.callObject());

        }
//
//        if (ctx.incrementVariable() != null)
//        {
//            return visitIncrementVariable(ctx.incrementVariable());
//
//        }
//
//
//        if (ctx.decrementVariable() != null) {
//
//            return visitDecrementVariable(ctx.decrementVariable());
//        }
//        if (ctx.callArray() != null)
//        {
//            return visitCallArray(ctx.callArray());
//        }


        return null;
    }




    @Override
    public CallFunction visitCallFunction(DartParser.CallFunctionContext ctx)
    {
        CallFunction callfun = new CallFunction();
        callfun.setId(ctx.ID().getText());
        if (ctx.parameters() != null && ctx.call() == null ) {
            callfun.setParameters(visitParameters(ctx.parameters()));
            return callfun;
        }
        if (ctx.parameters()!= null && ctx.call() != null )
        {
            callfun.setParameters(visitParameters(ctx.parameters()));
            for(int i=0 ; i< ctx.call().size() ; i++)
            {
                callfun.addCall(visitCall(ctx.call(i)));
            }
            return callfun;
        }
        return null;

    }



    @Override
    public List<Parameter> visitParameters(DartParser.ParametersContext ctx)
    {
        List<Parameter> list = new ArrayList<>();

        if (ctx.parameter() != null)
        {
            for(int i=0 ; i < ctx.parameter().size() ; i++)
            {
                list.add(visitParameter(ctx.parameter(i)));
            }

            return list ;

        }
        return null ;
    }


    @Override
    public Parameter visitParameter(DartParser.ParameterContext ctx) {

        Parameter param = new Parameter();

        if (ctx.decVar() != null)
        {
            Helper.symbolTable.parameter = true;
            param.setVariableDeclaration(visitDecVar(ctx.decVar()));
            Helper.symbolTable.parameter = false;

            return null;

        }

        if (ctx.call() != null) {

             param.setCall(visitCall(ctx.call()));
             return param;
        }
        if (ctx.expr() != null) {
             param.setExpression(visitExpr(ctx.expr()));
             return param;
        }
        if (ctx.declaration() != null) {

             param.setDeclaration(visitDeclaration(ctx.declaration()));
             return param;
        }

        return null;
    }


    @Override
    public Declaration visitDeclaration(DartParser.DeclarationContext ctx) {
        Declaration obj = new Declaration();

        if (ctx.classDeclaration() != null)
        {
            return visitClassDeclaration(ctx.classDeclaration());
        }
        if(ctx.decVar() != null )
        {
            visitDecVar(ctx.decVar());
        }

        if (ctx.decFun() != null) {
            visitDecFun(ctx.decFun());
        }



        return obj;
    }


    @Override
    public VariableDeclaration visitDecVar(DartParser.DecVarContext ctx) {


        VariableDeclaration vd = new VariableDeclaration();


        _Variable variable = new _Variable();
        variable.setType("variable");
        String name = null;


        if (ctx.CONST()!=null ) {vd._const=true;}
        if (ctx.FINAL() != null){vd._final = true;}


        if (ctx.nameType() != null) {
            variable.setDataType(visitNameType(ctx.nameType()));
            vd.setType(variable.getDataType());
        }
        if (ctx.ID()!= null) {
            name = ctx.ID().getText();
            vd.setVarName(ctx.ID().toString());
            Token idToken =ctx.ID().getSymbol();
            int line = idToken.getLine();
            Helper.symbolTable.add2symbolTable( line  , name , variable);

        }
        if (ctx.expr() != null) {


         //   data.setValue(visitExpr(ctx.expr()).toString());
           // vd.setExpression(visitExpr(ctx.expr()));

        }

        if (ctx.call() != null) {
            variable.setValue(visitCall(ctx.call()).toString());

        }

        return vd;
    }

    @Override
    public Object visitDecFun(DartParser.DecFunContext ctx) {
        _Function data = new _Function();
        data.setType("function");
        String name = null;

        int line = 0;

        if (ctx.returnType() != null) {
          data.setDataType( visitReturnType(ctx.returnType())) ;
        }


        if (ctx.functionBody() != null  &&  ctx.ID() !=null )
        {
            name = ctx.ID().getText();
            Token idToken =ctx.ID().getSymbol();
            line = idToken.getLine();
            Helper.symbolTable.add2symbolTable( line , name , data );
            Helper.symbolTable.openScope(ctx.ID().getText());
            visitFunctionBody(ctx.functionBody());
            Helper.symbolTable.closeScope(ctx.ID().getText());
        }

       // if (ctx.CP() != null){ Helper.symbolTable.closeScope(ctx.ID().getText());}
        return  null;

    }

    @Override
    public Object visitFunctionBody(DartParser.FunctionBodyContext ctx) {


        if (ctx.stat_block() != null) {
            visitStat_block(ctx.stat_block());
        }
        return null;
    }

    @Override
    public Object visitStat_block(DartParser.Stat_blockContext ctx) {

        if (ctx.block() != null) {
            visitBlock(ctx.block());
        }
        if (ctx.stat() != null) {
            visitStat(ctx.stat());
        }

        if (ctx.return_() != null)
        {
            visitReturn(ctx.return_());
        }
        return null;
    }

    @Override
    public String visitReturnType(DartParser.ReturnTypeContext ctx) {

        if (ctx.VOID() != null){
            return "void";
        }
        if (ctx.nameType() !=null){
            return  visitNameType(ctx.nameType());
        }
        if( ctx.ID() != null )
        {
            return ctx.ID().getText();
        }


        return null;
    }

    @Override
    public Object visitReturn(DartParser.ReturnContext ctx) {

        if (ctx.widget() != null) {
          //  visitWidget(ctx.widget());
        }

        if (ctx.expr() != null)
        {
           // visitExpr(ctx.expr());
        }

        if (ctx.call() != null)
        {
           // visitCall(ctx.call());
        }

        if (ctx.objectClass() != null) {
            //visitObjectClass(ctx.objectClass());
        }

        return null;
    }



    /////-----------<<  CLASS





    @Override
    public MethodBody visitMethodBody(DartParser.MethodBodyContext ctx)
    {

        if (ctx.stat() != null) {

            for (int i = 0 ; i< ctx.stat().size(); i++) {
                visitStat(ctx.stat(i));
            }
        }

        if (ctx.this_() != null) {


            for (int i = 0 ; i< ctx.stat().size(); i++) {
                visitThis(ctx.this_(i));
            }
        }

        if (ctx.return_()!= null)
        {
            visitReturn(ctx.return_());
        }

        return null;

    }




    @Override
    public ClassDeclaration visitClassDeclaration(DartParser.ClassDeclarationContext ctx) {


        ClassDeclaration obj = new ClassDeclaration();
        _Class data = new _Class();
        data.setType("class");

        if( ctx.ABSTRACT() != null)  obj.setAbstract(true);  else obj.setAbstract(false);
        if(ctx.superclass() != null ) obj.setSuperClass( visitSuperclass(ctx.superclass()));
        if(ctx.interfaces() != null)
        {
            //    obj.setAnInterfaces( visitInterfaces(ctx.interfaces()))
        };


        if(ctx.classBody() != null && ctx.ID() !=null )
        {
            Token idToken =ctx.ID().getSymbol();
            int line = idToken.getLine();

            obj.setClassName(ctx.ID().toString());
            String name = ctx.ID().getText();
            Helper.symbolTable.add2symbolTable(line , name , data);
            Helper.symbolTable.openScope(name);
            obj.setClassBody(visitClassBody(ctx.classBody()));
            Helper.symbolTable.closeScope(name);

        }

        return obj;

    }


//    @Override
//    public Object visitData(DartParser.DataContext ctx) {
//
//
//
//    }







    @Override
    public ClassBody visitClassBody(DartParser.ClassBodyContext ctx) {
        ClassBody obj = new ClassBody();
        for( int i=0 ; i< ctx.property().size() ; i++)
        {
            obj.getPropretes().add(visitProperty(ctx.property(i)));
        }
        for (int i = 0 ; i < ctx.classMethod().size() ; i++)
        {
            obj.getMethods().add(visitClassMethod(ctx.classMethod(i)));
        }
        // if( ctx.withConstructors() != null ){
        //  obj.setWithConstructor(visitWithConstructors(ctx.withConstructors());}
        return obj;
        }


    @Override
    public Property visitProperty(DartParser.PropertyContext ctx) {

        Property property = new Property();

        if (ctx.decVar() != null)
        {
         visitDecVar(ctx.decVar());
        }
        return property;

    }

    @Override
    public Constructor visitConstructor(DartParser.ConstructorContext ctx) {
        Constructor obj = new Constructor();

        if(ctx.ID() != null) {
            obj.setName(ctx.ID().getText());
        }

        if(ctx.parameterMethods() != null) {
            for(int i = 0; i < ctx.parameterMethods().size(); i++) {
                obj.getParameters().add(null);
                // visitParameterMethods(ctx.parameterMethods().get(i))
            }
        }

        if(ctx.methodBody() != null) {
            obj.setMethodBody(null);
            // visitMethodBody(ctx.methodBody())
        }
        return null;
    }
//    @Override
//    public DefConstructor visitDefConstructor(DartParser.DefConstructorContext ctx) {
//        DefConstructor defConstructor = new DefConstructor();
//
//        if(ctx.ID() != null) {
//            defConstructor.setName(ctx.ID().getText());
//        }
//
//        if(ctx.functionBody() != null) {
//            defConstructor.setMethodBody(null);
//            visitFunctionBody(ctx.functionBody());
//        }
//        return null;
//    }
//
//    @Override
//    public WithConstructor visitWithConstructors(DartParser.WithConstructorsContext ctx) {
//        WithConstructor withConstructor = new WithConstructor();
//
//        if(ctx.constructor() != null) {
//            withConstructor.setConstructor(visitConstructor(ctx.constructor()));
//        }
//
//        if(ctx.defConstructor() != null) {
//            withConstructor.setDefConstructor(visitDefConstructor((ctx.defConstructor())));
//        }
//
//        if(ctx.method() != null) {
//            for(int i = 0 ; i < ctx.method().size(); i++) {
//                withConstructor.getMethods().add(visitMethod(ctx.method().get(i)));
//            }
//        }
//
//        if (ctx.property() != null) {
//            for(int i = 0; i < ctx.property().size(); i++) {
//                withConstructor.getProperties().add(visitProperty(ctx.property().get(i)));
//            }
//        }
//        return null;
//    }

    @Override
    public Interfaces visitInterfaces(DartParser.InterfacesContext ctx) {
        Interfaces interfaces = new Interfaces();

        if(ctx.typeNotVoidList() != null) {
            interfaces.setTypeNotVoids(null);
            // visitTypeNotVoidList(ctx.typeNotVoidList())
        }
        return null;
    }

    @Override
    public Object visitThis(DartParser.ThisContext ctx) {
        return null;
    }

    @Override
    public Object visitTypeNotVoidList(DartParser.TypeNotVoidListContext ctx) {
        return null;
    }


    //  ---------- << Expression >> ---------
    @Override
    public Expression visitExpr(DartParser.ExprContext ctx) {
       if(ctx.MIN() != null)
       {
           MinExpr minExpr = new MinExpr();
           minExpr.setExpression(visitExpr(ctx.expr(1)));
           return minExpr;
       }
       else if (ctx.P() != null )
       {
           Addition addition =new Addition();


           addition.setLeft(visitExpr(ctx.expr(1)));
           addition.setRight(visitExpr(ctx.expr(2)));
           return addition;

       }
       else if (ctx.MOD() != null ) {
           ModExpr modExpr =new ModExpr();
           modExpr.setLeft(visitExpr(ctx.expr(0)));
           modExpr.setRight(visitExpr(ctx.expr(1)));
           return modExpr;

       }
       else if(ctx.DIV() != null )
       {
           Division division =new Division();
           division.setLeft(visitExpr(ctx.expr(0)));
           division.setRight(visitExpr(ctx.expr(1)));
           return division;
       }

       else if (ctx.MUL() == null) {
           Multiplication mul = new Multiplication();
           mul.setLeft(visitExpr(ctx.expr(0)));
           mul.setRight(visitExpr(ctx.expr(1)));
           return null;
       }

//       else if (ctx.callArray()!=null)
//       {
//           return visitCallArray(ctx.callArray());
//
//       }
//       else if (ctx.data() != null) {
//
//           return visitData(ctx.data());
//       }

        Unit unit = new Unit();
       unit.setExpression(visitExpr(ctx.expr(1)));
       return unit ;

    }


    @Override
    public Method visitClassMethod(DartParser.ClassMethodContext ctx) {
        Method obj = new Method();
        _Method data = new _Method();
        data.setType("method");
        String name = null;


        if(ctx.returnType() != null) {
            String dataType = visitReturnType(ctx.returnType());
            obj.setReturnType(dataType);
            data.setDataType(dataType);

        }

        if(ctx.parameterMethods() != null) {
            //obj.getParameters().add(null);
            // visitParameterMethods(ctx.parameterMethods())
        }

        if(ctx.methodBody() != null && ctx.ID() != null)
        {
            name = ctx.ID().getText();
            Token idToken =ctx.ID().getSymbol();
            int line = idToken.getLine();
            Helper.symbolTable.add2symbolTable(line, name ,data);
            Helper.symbolTable.openScope(name);
            obj.setMethodBody(visitMethodBody(ctx.methodBody()));
            Helper.symbolTable.closeScope(name);
        }
        return obj;
    }

    @Override
    public SuperClass visitSuperclass(DartParser.SuperclassContext ctx) {
        SuperClass obj = new SuperClass();

        if(ctx.typeNotVoid() != null) {
            obj.setTypeNotVoid(null);
            // visitTypeNotVoid(ctx.typeNotVoid())
        }

        if(ctx.mixins() != null) {
            obj.setMixins(null);
            // visitMixins(ctx.mixins())
        }
        return null;
    }









    //// logical Operator

    @Override
    public Object visitLogical(DartParser.LogicalContext ctx) {

        LogicalOperator obj = new LogicalOperator() ;

        if(ctx.AA() != null ) obj.setOperator(ctx.AA().getText());
        if(ctx.OR() != null ) obj.setOperator(ctx.OR().getText());
        if(ctx.NOT() != null ) obj.setOperator(ctx.NOT().getText());

        if(ctx.logical(0) !=null && ctx.logical(1) != null)
        {
//            obj.setLeft(visitLogical(ctx.logical(0)));
//            obj.setRight(visitLogical(ctx.logical(1)));

        }
        else if (ctx.comparsion() != null )
        {
//            obj.setComp(visitComparsion(ctx.comparsion()));
        }
        else if (ctx.BOOL_VALUE() != null)
        {
            obj.setBoolValue(Boolean.parseBoolean(ctx.BOOL_VALUE().getText()));
        }else if ( ctx.ID() != null){obj.setID(ctx.ID().getText());}

       return obj;

    }


    //---------- << Data >>-------

    @Override
    public Assignment visitAssignment(DartParser.AssignmentContext ctx) {
        Assignment obj = new Assignment();

        if( ctx.ID() != null )
        {

            String varName = ctx.ID().toString();
            obj.setVarName(varName);
        }else if ( ctx.this_() != null )
        {
//            obj.setaThis(visitThis(ctx.this_()));
        }
        obj.setOperator(ctx.getChild(2).getText());
        obj.setRight(visitExpr(ctx.expr()));
        return obj;
    }

    @Override
    public Object visitComparsion(DartParser.ComparsionContext ctx) {


        if(ctx.LE() != null)
        {
            LessEqual obj = new LessEqual();
            obj.setLeft(visitExpr(ctx.expr(0)));
            obj.setRight(visitExpr(ctx.expr(1)));
            return obj;
        }
        else if (ctx.EGT() != null )
        {

            GreaterEqual obj = new GreaterEqual();
            obj.setLeft(visitExpr(ctx.expr(0)));
            obj.setRight(visitExpr(ctx.expr(1)));
            return obj;

        }
        else if (ctx.LT() != null )
        {
            lessOperator obj = new lessOperator();
            obj.setLeft(visitExpr(ctx.expr(0)));
            obj.setRight(visitExpr(ctx.expr(1)));
            return obj;

        }
        else if(ctx.GT() != null )
        {

            GreaterOperator obj = new GreaterOperator();
            obj.setLeft(visitExpr(ctx.expr(0)));
            obj.setRight(visitExpr(ctx.expr(1)));
            return obj;
        }

        else if (ctx.EE() != null)
        {
            Equal obj = new Equal();
            obj.setLeft(visitExpr(ctx.expr(0)));
            obj.setRight(visitExpr(ctx.expr(1)));
            return obj;
        }

            NotEqual obj = new NotEqual();
            obj.setLeft(visitExpr(ctx.expr(0)));
            obj.setRight(visitExpr(ctx.expr(1)));
            return obj;


    }


    //-----------Objects--------------

    @Override
    public ObjectClass visitObjectClass(DartParser.ObjectClassContext ctx) {
        ObjectClass objectClass = new ObjectClass();
        if(ctx.objectParameters() != null) {
            objectClass.setObjectParameters(visitObjectParameters(ctx.objectParameters()));
        }
        if(ctx.STRING_singl() != null) {
         return  null;  // objectClass.setStringType(ctx.STRING_singl().getText());
        }
        return null;
    }

    @Override
    public ObjectParameters visitObjectParameters(DartParser.ObjectParametersContext ctx) {
        ObjectParameters objectParameters = new ObjectParameters();
        if(ctx.objectParameter() != null) {
            for(int i = 0; i < ctx.objectParameter().size(); i++) {
                objectParameters.getObjectParameters().add(visitObjectParameter(ctx.objectParameter(i)));
            }
        }
        return null;
    }

    @Override
    public ObjectParameter visitObjectParameter(DartParser.ObjectParameterContext ctx) {
        ObjectParameter objectParameter = new ObjectParameter();
        if(ctx.ID(0) != null) {
            objectParameter.setObjectName(ctx.ID(0).getText());
        }
        if(ctx.objectClass() != null) {
            objectParameter.setObjectClass(visitObjectClass( ctx.objectClass() ));
        }
        if(ctx.ID(1) != null) {
            objectParameter.setID(ctx.ID(1).getText());
        }
        if(ctx.call() != null) {
            objectParameter.setCall(visitCall(ctx.call(1)));
        }
        if(ctx.arrowAndAnonFun() != null) {
//            objectParameter.setAnonymousFunction(visitArrowAndAnonFun(ctx.arrowAndAnonFun()));
        }
        if(ctx.data() != null) {
//            objectParameter.setData(visitData(ctx.data()));
        }
        return null;
    }

    @Override
    public ObjectProperty visitObjectProperty(DartParser.ObjectPropertyContext ctx) {
        ObjectProperty objectProperty = new ObjectProperty();

        if(ctx.ID(0) != null) {
            objectProperty.setObjectName(ctx.ID(0).getText());
        }

        for(int i = 1; i < ctx.ID().size(); i++) {
            if(ctx.ID(i) != null) {
                objectProperty.getPropertyNames().add(ctx.ID(i).getText());
            }
        }
        return null;
    }

    @Override
    public ObjectMethod visitObjectMethod(DartParser.ObjectMethodContext ctx) {
        ObjectMethod objectMethod = new ObjectMethod();

        if(ctx.ID() != null) {
            objectMethod.setObjectName(ctx.ID().getText());
        }

        if(ctx.callFunction() != null) {
            objectMethod.setCallFunction(visitCallFunction(ctx.callFunction()));
        }
        return null;
    }

    @Override
    public CallObject visitCallObject(DartParser.CallObjectContext ctx) {
        CallObject callObject = new CallObject();

        if(ctx.objectClass() != null) {
            callObject.setObjectClass(visitObjectClass(ctx.objectClass()));
        }
        return null;
    }

    @Override
    public ObjectDeclaration visitObjectDeclaration(DartParser.ObjectDeclarationContext ctx) {
        ObjectDeclaration objectDeclaration = new ObjectDeclaration();

        if(ctx.ID() != null) {
            objectDeclaration.setID(ctx.ID().getText());
        }

        if(ctx.objectClass() != null) {
            objectDeclaration.setObjectClass(visitObjectClass(ctx.objectClass()));
        }

        return null;
    }

    @Override
    public Object visitAnonymousFunction(DartParser.AnonymousFunctionContext ctx) {
        return null;
    }


// --- For ----

//
//    @Override
//    public DeclarationFunction visitDecFun(DartParser.DecFunContext ctx)
//    {
//        DeclarationFunction obj = new DeclarationFunction();
//
//        ctx.returnType();
//
//        obj.setName( ctx.ID().getText());
//        obj.setFunctionBody( visitFunctionBody(ctx.functionBody()) );
//        obj.setArrowFunction( visitArrowFunction( ctx.arrowFunction()));
//
//        for ( int i=0 ; i< ctx.parametersDeclareFun().size() ; i++)
//        {
//
//            obj.getParameterFunctions().add(visitParametersDeclareFun(ctx.parametersDeclareFun().get(i)));
//
//        }
//
//
//    }


//    @Override
//    public String  visitReturnType(DartParser.ReturnTypeContext ctx) {
//
//        if (ctx.VOID() != null) {
//            return ctx.VOID().getText();
//        }
//
//            return visitNameType( ctx.nameType() );
//    }
//
//
//
//
//    @Override
//    public FunctionBody visitFunctionBody(DartParser.FunctionBodyContext ctx)
//    {
//
//    }


    @Override
    public String visitNameType(DartParser.NameTypeContext ctx) {

        if (ctx.INT_TYPE() != null) {
            return  ctx.INT_TYPE().getText();
        }
        if (ctx.BOOL_TYPE() != null) {
            return ctx.BOOL_TYPE().getText();
        }
        if (ctx.STRING_TYPE() != null) {
            return ctx.STRING_TYPE().getText();
        }
        if (ctx.FLOAT_TYPE() != null) {
            return ctx.FLOAT_TYPE().getText();
        }
        if (ctx.DOUBLE_TYPE() != null)
        {
            return ctx.DOUBLE_TYPE().getText();
        }
        if (ctx.VAR() != null) {
            return ctx.VAR().getText();
        }
         else
         {
             return "";
             //visitObjectType(ctx.objectType());
         }


    }




//----------------<<<  Loops >> ---


//
//    @Override
//    public VariableDeclaration visitVarableDeclaration(DartParser.VarableDeclarationContext ctx) {
//        VariableDeclaration obj=new VariableDeclaration();
//        boolean m=ctx.CONST().Boolean.parseBoolean();
//        boolean l=ctx.FINAL().Boolean.parseBoolean();
//        String k=ctx.VARNAME().toString();
//        String ll=ctx.TYPE().Boolean.parseBoolean();
//        boolean h=ctx.ABOOLEAN().Boolean.parseBoolean();
//        if(ctx.BOOLE_TYPE()!=null){
//            obj.set_const(m);
//        }
//        else{
//            obj.set_const(false);
//        }
//        if(ctx.FINAL()!=null){
//            obj.set_final(l);
//        }
//        else{
//            obj.set_final(false);
//        }
//        if(ctx.VARNAME()!=null){
//            obj.setVarName(k);
//        }
//        else{
//            obj.setVarName(null);
//        }
//        if(ctx.TYPE()!=null){
//            obj.setType(ll);
//        }
//        else{
//            obj.setType(null);
//        }
//        if(ctx.ABOOLEAN()!=null){
//            obj.setaBoolean(h);
//        }
//        else{
//            obj.setaBoolean(false);
//        }
//        obj.setExpression();
//
//        return obj;
//    }
//
//    @Override
//    public Assignment visitAssignment(DartParser.AssignmentContext ctx) {
//        Assignment obj=new Assignment();
//        return obj;
//    }
//
//
//    @Override
//    public ForInitStatement visitForinitstatement(DartParser.ForinitstatementContext ctx)
//    {
//        ForInitStatement obj = new ForInitStatement();
//        obj.setVariableDeclaration(visitVarableDeclaration(ctx.variabledeclaration()));
//        obj.setAssignment(visitAssignment(ctx.assignment()));
//
//        return obj;
//
//    }
//
//    @Override
//    public _Condition visitCondition(DartParser.ConditionContext ctx) {
//        _Condition obj=new _Condition();
//        obj.setCall(visitCall(ctx.call()));
//        obj.setComparison(visitComparison(ctx.comparison()));
//        obj.setLogicalOperator(visitLogical(ctx.logical()));
//        return obj;
//    }
//
//    @Override
//    public IncrementVariable visitIncrementVariable(DartParser.IncrementVariableContext ctx) {
//        String name=ctx.ID().toString();
//
//        IncrementVariable obj =new IncrementVariable();
//        if (ctx.ID()!=null){
//            obj.setID(name);
//        }
//        else{
//            obj.setID(null);
//        }
//
//
//
//
//        return obj;
//    }
//
//    @Override
//    public DecrementVariable visitDecrementVariable(DartParser.DecrementVariableContext ctx) {
//        DecrementVariable obj =new DecrementVariable();
//        String name=ctx.ID().toString();
//        int n=ctx.
//                ctx.MINMIN().Integer.parseInt();
//        if(ctx.MINMIN()!=null){
//            obj.setMINMIN(n);
//        }
//        else{
//            obj.setMINMIN(null);
//        }
//        if(ctx.ID()!=null){
//            obj.setID(name);
//        }
//        else{
//            obj.setID(null);
//        }
//
//        return obj;
//    }
//
//    @Override
//    public For visitForStatement(DartParser.ForStatementContext ctx)
//    {
//        For obj = new For();
//        obj.setForInitStatement (visitForinitstatement(ctx.forinitstatement()) );
//        obj.setCondition( visitCondition(ctx.condition()) );
//        obj.setExpression( visitExpr(ctx.expr()) );
//        obj.setIncrementVariable(visitIncrementVariable(ctx.incrementVariable()));
//        obj.setDecrementVariable(visitDecrementVariable(ctx.decrementVariable()));
//        return  obj;
//    }
//
//    // --- Do_While---
//
//
//    @Override
//    public Stat_block visitStat_block(DartParser.Stat_blockContext ctx) {
//        Stat_block obj =new Stat_block();
//        return obj;
//    }
//
//    @Override
//    public Do_While visitDo_while_stat(DartParser.Do_while_statContext ctx) {
//        Do_While obj =new Do_While();
//        obj.setStat_block(visitStat_block(ctx.stat_block()));
//        obj.setCondition(visitCondition(ctx.condition()));
//        return obj;
//    }
//
//    // -- While---
//
//    @Override
//    public While visitWhile_stat(DartParser.While_statContext ctx) {
//        While obj=new While();
//        obj.setCondition(visitCondition(ctx.condition()));
//        obj.setStat_block(visitStat_block(ctx.stat_block()));
//
//
//        return obj;
//    }




    ///--------------<<< Widgets >>>----------


    @Override
    public Widget visitWidget(DartParser.WidgetContext ctx) {

        Widget widget = new Widget();
        String htmlCode =" <html> \n <head>\n" +
                "                    <meta charset=\"UTF-8\">\n" +
                "                    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                "                    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "                    <link rel=\"stylesheet\" href=\"style.css\">\n" +
                "                    <title> bbbbbbbbbb </title>\n" +
                "                </head>\n" +
                "                <body>";

        Helper.files.get(Helper.currentHtmlName).addToHtmlFile(htmlCode);
        if (ctx.listOfWidget()!= null)
        {
            widget =  visitListOfWidget(ctx.listOfWidget());
        }
        htmlCode = "\n</body>\n" +
                " </html>";
        Helper.files.get(Helper.currentHtmlName).addToHtmlFile(htmlCode);



        FileManagement.writeToTheFile("../style.css" ,FileManagement.CssCode );
        FileManagement.writeToTheFile("../"+Helper.currentHtmlName+".php" ,Helper.files.get(Helper.currentHtmlName).htmlCode);

        return widget;
    }



    @Override
    public Widget visitListOfWidget(DartParser.ListOfWidgetContext ctx) {
        Widget widget = new Widget();



        if(ctx.container()!= null)
        {

            return visitContainer(ctx.container());
        }
        if(ctx.text() != null)
        {
            return   visitText(ctx.text());
        }
        if(ctx.center() != null)
        {
            return   visitCenter(ctx.center());
        }
        if (ctx.row()!=null)
        {
            Helper.files.get(Helper.currentHtmlName).addToHtmlFile("<table>");
            widget =  visitRow(ctx.row());

            Helper.files.get(Helper.currentHtmlName).addToHtmlFile("</table>");        }
        if (ctx.column() != null) {

            Helper.files.get(Helper.currentHtmlName).addToHtmlFile("<table>");
            widget = visitColumn(ctx.column());

            Helper.files.get(Helper.currentHtmlName).addToHtmlFile("</table>");
        }

        if (ctx.sizedBox() != null) {
            return  visitSizedBox(ctx.sizedBox());
        }

        if (ctx.image() != null)
        {
            visitImage(ctx.image());
        }

        if (ctx.scaffold() != null) {
            visitScaffold(ctx.scaffold());
        }

        if(ctx.textFiled() != null)
        {
            visitTextFiled(ctx.textFiled());
        }

        return widget;
    }




    ///--------------<<< Visit Container Widget >>>----------


    @Override
    public Widget visitContainer(DartParser.ContainerContext ctx)  {

        Container container = new Container();
        String cssCode = "\n."+ container.getWidgetName()+"{";

        if(ctx.color() != null)
        {
            cssCode +=  "\nbackground:"+visitColor(ctx.color())+ ";\n";
        }


        if( ctx.width() != null)
        {
            cssCode += " width:"+ visitWidth(ctx.width())+"px;\n";

        }

        if( ctx.height() != null)
        {
            cssCode +=" height:"+ visitHeight(ctx.height())+"px;\n";

        }
        cssCode+= "}";
        FileManagement.addToCssFile(cssCode);

        String code = "<div class ='"+container.widgetName+"' >";
        Helper.files.get(Helper.currentHtmlName).addToHtmlFile(code);
        if(ctx.child() != null)
        {
            container.setChild(visitChild(ctx.child()));
        }

        Helper.files.get(Helper.currentHtmlName).addToHtmlFile("</div>");

        Helper.widgets.put(container.widgetName , container);
        return container;

    }

    @Override
    public Widget visitChild(DartParser.ChildContext ctx ) {
        return visitListOfWidget(ctx.listOfWidget());
    }

    @Override
    public String visitWidth(DartParser.WidthContext ctx) {
        if(ctx.INT_NUM()!=null)
        {
            return   ctx.INT_NUM().getText();

        }
        else
        {
            return ctx.FLOAT_NUM().getText();
        }    }

    @Override
    public String visitHeight(DartParser.HeightContext ctx) {
        if(ctx.INT_NUM()!=null)
        {
            return   ctx.INT_NUM().getText();

        }
        else
        {
            return ctx.FLOAT_NUM().getText();
        }
    }


    @Override
    public String visitColor(DartParser.ColorContext ctx) {
        if(ctx.colorName() !=null)
        {
            return visitColorName(ctx.colorName());
        }
        else if (ctx.colorRGB()!=null)
        {
            return  visitColorRGB(ctx.colorRGB());
        }
        return null;

    }



    @Override
    public String visitColorName(DartParser.ColorNameContext ctx) {
        return ctx.ID().getText();
    }

    @Override
    public String visitColorRGB(DartParser.ColorRGBContext ctx) {
        return "rgb("+ctx.INT_NUM(0)+","+ctx.INT_NUM(1)+","+ctx.INT_NUM(2)+")";
    }




    ///--------------<<< Visit Text Widget >>>----------


    @Override
    public Widget visitText(DartParser.TextContext ctx) {

        Text text= new Text();

        if (ctx.style() != null)
        {
            String name = text.getWidgetName();
            FileManagement.addToCssFile("\n." + name + "{\n");
            text = (Text) visitStyle( ctx.style());
            text.setWidgetName(name);
        }


        Helper.files.get(Helper.currentHtmlName).addToHtmlFile("\n<span class=\""+text.getWidgetName()+"\">");

        if (ctx.text_data() != null)
        {
            text.setData(visitText_data(ctx.text_data()));
            Helper.files.get(Helper.currentHtmlName).addToHtmlFile(text.getData());
        }

        Helper.files.get(Helper.currentHtmlName).addToHtmlFile("<span/>");
        return text;
    }


    @Override
    public Widget visitStyle(DartParser.StyleContext ctx ) {

        Text text = new Text();

        if(ctx.color() != null)
        {
            text.setColor(visitColor(ctx.color()));
            FileManagement.addToCssFile("\ncolor:"+text.getColor()+";");
        }
        if(ctx.fontSize() != null)
        {
            text.setFontSize(visitFontSize(ctx.fontSize()));
            FileManagement.addToCssFile("\nfont-size:"+text.getFontSize()+";");
        }
        if(ctx.fontFamily() != null)
        {
            text.setFontFamily(visitFontFamily(ctx.fontFamily()));
            FileManagement.addToCssFile("\nfont-family:"+text.getFontFamily()+";");
        }


        FileManagement.addToCssFile("\n}");
        return text ;
    }

    @Override
    public String visitFontFamily(DartParser.FontFamilyContext ctx) {
        return ctx.ID().getText();
    }

    @Override
    public String visitFontSize(DartParser.FontSizeContext ctx) {
        if (ctx.INT_NUM()!=null){
            return  ctx.INT_NUM().getText();
        }
        else
        {
            return  ctx.FLOAT_NUM().getText();
        }
    }

    @Override
    public String visitText_data(DartParser.Text_dataContext ctx) {
        if(ctx.ID() !=null)
        {
            return ctx.ID().getText();
        }
        if(ctx.STRING_singl() !=null)
        {
            String str = ctx.STRING_singl().getText();
            return str.substring(1,str.length()-1);
        }
        return null;
    }

    @Override
    public Widget visitCenter(DartParser.CenterContext ctx) {

        Center center = new Center();
        if (ctx.child()!= null)
        {
            Helper.files.get(Helper.currentHtmlName).addToHtmlFile("\n<center>");
            center.setChild(visitChild(ctx.child()));
            Helper.files.get(Helper.currentHtmlName).addToHtmlFile("</center>");

        }
        return center;
    }


    ///--------------<<< Visit Column Widget >>>----------


    @Override
    public Widget visitColumn(DartParser.ColumnContext ctx) {


        if (ctx.align() != null) {

        }
        if (ctx.spacing() != null) {

        }

        if (ctx.padding() != null) {

        }

        if (ctx.direction() != null) {

        }

        if (ctx.childrenOfColumn() != null) {

            return visitChildrenOfColumn(ctx.childrenOfColumn());
        }




        return null;
    }


    @Override
    public Widget visitChildrenOfColumn(DartParser.ChildrenOfColumnContext ctx) {


        Column column = new Column();


        for (int i=0 ; i < ctx.listOfWidget().size() ; i++ )
        {
            //Helper.files.get(Helper.currentHtmlName).addToHtmlFile("<div class=\"column\">\n");


            Helper.files.get(Helper.currentHtmlName).addToHtmlFile("<tr>");

            column.getChildren().add(visitListOfWidget(ctx.listOfWidget().get(i)));

            Helper.files.get(Helper.currentHtmlName).addToHtmlFile("</tr>");
        }


        return column;
    }



    ///--------------<<< Visit Row Widget >>>----------

    @Override
    public Widget visitRow(DartParser.RowContext ctx) {

        if (ctx.align() != null) {

        }
        if (ctx.spacing() != null) {

        }

        if (ctx.padding() != null) {

        }

        if (ctx.direction() != null) {

        }

        if (ctx.childrenOfRow() != null) {

            return visitChildrenOfRow(ctx.childrenOfRow());

        }
        else
        {
            return null;
        }
    }


    @Override
    public Widget visitChildrenOfRow(DartParser.ChildrenOfRowContext ctx) {

        Row row = new Row();
        Helper.files.get(Helper.currentHtmlName).addToHtmlFile("<tr>");

        for (int i=0 ; i < ctx.listOfWidget().size() ; i++ )
        {
            Helper.files.get(Helper.currentHtmlName).addToHtmlFile("<th>");


            row.getChildren().add( visitListOfWidget(ctx.listOfWidget().get(i)));

            Helper.files.get(Helper.currentHtmlName).addToHtmlFile("</th>");

        }
        Helper.files.get(Helper.currentHtmlName).addToHtmlFile("</tr>");

        return row;
    }




    ///--------------<<< Visit SizedBox Widget >>>----------

    @Override
    public Widget visitSizedBox(DartParser.SizedBoxContext ctx) {

        SizedBox sizedBox = new SizedBox();

        if (ctx.size() != null) {
            sizedBox = (SizedBox) visitSize(ctx.size());
            String code = "<div class =\""+sizedBox.getWidgetName()+ "\">";
            Helper.files.get(Helper.currentHtmlName).addToHtmlFile(code);

            Helper.files.get(Helper.currentHtmlName).addToHtmlFile("");

            if (ctx.child() != null) {

                sizedBox.setChild( visitChild(ctx.child()));
            }

            Helper.files.get(Helper.currentHtmlName).addToHtmlFile("</div>");
        }


        return sizedBox;
    }

    @Override
    public Widget visitSize(DartParser.SizeContext ctx) {
        if (ctx.size2() != null) {
            return visitSize2(ctx.size2());
        }
        return null;
    }

    @Override
    public Widget visitSize2(DartParser.Size2Context ctx) {

        SizedBox sizedBox  = new SizedBox();
        String cssCode = "\n."+ sizedBox.getWidgetName()+"{";

        if( ctx.width() != null)
        {
            String width = visitWidth(ctx.width());
            sizedBox.setWidth(width);
            cssCode += " width:"+ width +"px;\n";

        }
        if( ctx.height() != null)
        {
            String height = visitHeight(ctx.height());
            sizedBox.setHeight(height);
            cssCode +="height:"+height +"px;\n";

        }

        if (ctx.getChild(3) != null) {
            String width = ctx.getChild(3).getText();
            sizedBox.setWidth(width);
            cssCode += " width:"+ width+"px;\n";

        }

        if (ctx.getChild(5) != null) {
            String height = ctx.getChild(5).getText();
            sizedBox.setHeight(height);

            cssCode += "height:"+ height+"px;\n";

        }

        cssCode += "background: rgba(0, 0, 0 ,0);}\n ";
        FileManagement.addToCssFile(cssCode);

        return sizedBox;
    }


    @Override
    public Widget visitImage(DartParser.ImageContext ctx) {

        Image image = new Image();

        String htmlCode = "<img ";
        if (ctx.image_provider()!=null)
        {
            image.setLink(visitImage_provider(ctx.image_provider()));
            htmlCode +=" src="+image.getLink();
        }
        if ( ctx.width() != null)
        {
            image.setWidth(visitWidth(ctx.width()));
            htmlCode +=" width="+image.getWidth();
        }
        if (ctx.height() != null) {
            image.setHeight(visitHeight(ctx.height()));
            htmlCode +=" height="+image.getHeight();
        }
        if (ctx.alignment() != null) {

        }
        if (ctx.padding() != null) {

        }
        if (ctx.color() != null) {

        }
        if (ctx.child() != null) {

        }

        htmlCode +=">";
        Helper.files.get(Helper.currentHtmlName).addToHtmlFile(htmlCode);
        return image;
    }

    @Override
    public String visitImage_provider(DartParser.Image_providerContext ctx) {
        if (ctx.assetImage() != null)
        {
            return visitAssetImage(ctx.assetImage());
        }

        return null;
    }

    @Override
    public String visitAssetImage(DartParser.AssetImageContext ctx) {
        if (ctx.STRING_singl() != null)
        {
            String local="http://localhost/project-v 0.1/";
            String image=ctx.STRING_singl().getText();
            image=image.substring(1,image.length()-1);
            return '"'+local+image+'"';
        }
        return null;
    }




    ///--------------<<< Visit Scaffold Widget >>>----------


    @Override
    public Widget visitScaffold(DartParser.ScaffoldContext ctx) {


        Scaffold scaffold = new Scaffold();
//        FileManagement.addToCssFile(".scaffold {");
//        Helper.files.get(Helper.currentHtmlName).addToHtmlFile("<div class=\"scaffold\">");

        if (ctx.floatingActionButton()!= null) {

            scaffold.setFloatingActionButton(visitFloatingActionButton(ctx.floatingActionButton())) ;
        }

        if (ctx.appBar()!=null){
            scaffold.setAppBar(visitAppBar(ctx.appBar()));
        }
        if (ctx.body()!=null)
        {
            scaffold.setBody(visitBody(ctx.body()));
        }


        // Helper.files.get(Helper.currentHtmlName).addToHtmlFile("</div>");
        return scaffold;
    }

    @Override
    public Widget visitBody(DartParser.BodyContext ctx) {

        if (ctx.listOfWidget() != null)
        {
            return visitListOfWidget(ctx.listOfWidget());
        }

        return null;
    }

    @Override
    public Widget visitAppBar(DartParser.AppBarContext ctx) {
        return null;
    }

    ///--------------<<< Visit FloatingActionButton Widget >>>----------

    @Override
    public FloatingActionButton visitFloatingActionButton(DartParser.FloatingActionButtonContext ctx) {


        FloatingActionButton button = new FloatingActionButton();


        if (ctx.onPressed() != null) {
            visitOnPressed(ctx.onPressed());
        }

        String cssCode = ".floating-button {\n" +
                "  position: fixed;\n" +
                "  bottom: 20px;\n" +
                "  right: 20px;\n" +
                "  color: white;\n" +
                "  font-size: 27px;\n" +
                "  padding: 16px 20px;\n" +
                "  border-radius: 50%;\n" +
                "  text-align: center;\n" +
                "  box-shadow: 0 5px 6px rgba(0, 0, 0, 0.3);\n" +
                "  z-index: 999;\n"+
                "  text-decoration:none;\n";

        if (ctx.color() != null) {
            cssCode +="  background-color:" + visitColor(ctx.color())+";\n";
        }
        else
        {
            cssCode += "  background-color: rgba(0,155,255);\n" ;
        }
        FileManagement.addToCssFile(cssCode +="}\n");


        if (ctx.child() != null)
        {
            button.setChild(visitChild(ctx.child()));
        }

        return button;
    }


    // TextFiled


    @Override
    public Object visitTextFiled(DartParser.TextFiledContext ctx) {
        TextFiled tf=new TextFiled();
        String cssCode = "";
        if(ctx.attribute().size()!=0) {
            cssCode+="\n#"+ tf.getWidgetName()+"{";
            for (DartParser.AttributeContext attr : ctx.attribute()) {
                if(attr.inputDecoration()!=null)
                {
                    tf.labelText+=visit(attr.inputDecoration());
                }
                else if(attr.width()!=null)
                {
                    cssCode+="\n width:"+visitWidth(attr.width())+"%\n";
                }
                else {
                    // add the variable controller to array session
                }
            }
            cssCode+="}";
        }
        Helper.files.get(Helper.currentHtmlName).addToHtmlFile(tf.buildCode());
        FileManagement.addToCssFile(cssCode);

        return null;
    }



    @Override
    public String visitInputDecoration(DartParser.InputDecorationContext ctx) {
        return ctx.label().STRING().toString();
    }

    //Navigator



    @Override
    public Object visitNavigator(DartParser.NavigatorContext ctx) {
        ObjectClass link = visitObjectClass(ctx.objectClass());
        if(link.objectParameters!=null)
        {
            Helper.files.get(Helper.currentHtmlName).addToHtmlFile("<?php ");
            for (ObjectParameter parameter : link.objectParameters.getObjectParameters()) {
                Helper.files.get(Helper.currentHtmlName).addToHtmlFile("\n $__SESSION["+parameter.objectName+"]=Map varible value");
            }
            Helper.files.get(Helper.currentHtmlName).addToHtmlFile("?>");
        }
        System.out.println(link+"Sdasdasda");
        Helper.files.get(Helper.currentHtmlName).addToHtmlFile("<a href=\""+link.name+".php\" class=\"floating-button\">+</a>");
        return super.visitNavigator(ctx);
    }
}


