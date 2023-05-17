// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DartParser}.
 */
public interface DartParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DartParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(DartParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(DartParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(DartParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(DartParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#imports}.
	 * @param ctx the parse tree
	 */
	void enterImports(DartParser.ImportsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#imports}.
	 * @param ctx the parse tree
	 */
	void exitImports(DartParser.ImportsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(DartParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(DartParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(DartParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(DartParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void enterIf_stat(DartParser.If_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void exitIf_stat(DartParser.If_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void enterStat_block(DartParser.Stat_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void exitStat_block(DartParser.Stat_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#loops}.
	 * @param ctx the parse tree
	 */
	void enterLoops(DartParser.LoopsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#loops}.
	 * @param ctx the parse tree
	 */
	void exitLoops(DartParser.LoopsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stat(DartParser.While_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stat(DartParser.While_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#do_while_stat}.
	 * @param ctx the parse tree
	 */
	void enterDo_while_stat(DartParser.Do_while_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#do_while_stat}.
	 * @param ctx the parse tree
	 */
	void exitDo_while_stat(DartParser.Do_while_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(DartParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(DartParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(DartParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(DartParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#decArray}.
	 * @param ctx the parse tree
	 */
	void enterDecArray(DartParser.DecArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#decArray}.
	 * @param ctx the parse tree
	 */
	void exitDecArray(DartParser.DecArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#decpartArray}.
	 * @param ctx the parse tree
	 */
	void enterDecpartArray(DartParser.DecpartArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#decpartArray}.
	 * @param ctx the parse tree
	 */
	void exitDecpartArray(DartParser.DecpartArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#anonArray}.
	 * @param ctx the parse tree
	 */
	void enterAnonArray(DartParser.AnonArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#anonArray}.
	 * @param ctx the parse tree
	 */
	void exitAnonArray(DartParser.AnonArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#arraybody}.
	 * @param ctx the parse tree
	 */
	void enterArraybody(DartParser.ArraybodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#arraybody}.
	 * @param ctx the parse tree
	 */
	void exitArraybody(DartParser.ArraybodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#callArray}.
	 * @param ctx the parse tree
	 */
	void enterCallArray(DartParser.CallArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#callArray}.
	 * @param ctx the parse tree
	 */
	void exitCallArray(DartParser.CallArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#callFunction}.
	 * @param ctx the parse tree
	 */
	void enterCallFunction(DartParser.CallFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#callFunction}.
	 * @param ctx the parse tree
	 */
	void exitCallFunction(DartParser.CallFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#incrementVariable}.
	 * @param ctx the parse tree
	 */
	void enterIncrementVariable(DartParser.IncrementVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#incrementVariable}.
	 * @param ctx the parse tree
	 */
	void exitIncrementVariable(DartParser.IncrementVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#decrementVariable}.
	 * @param ctx the parse tree
	 */
	void enterDecrementVariable(DartParser.DecrementVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#decrementVariable}.
	 * @param ctx the parse tree
	 */
	void exitDecrementVariable(DartParser.DecrementVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forStatement}
	 * labeled alternative in {@link DartParser#for_stat}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(DartParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forStatement}
	 * labeled alternative in {@link DartParser#for_stat}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(DartParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#forinitstatement}.
	 * @param ctx the parse tree
	 */
	void enterForinitstatement(DartParser.ForinitstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#forinitstatement}.
	 * @param ctx the parse tree
	 */
	void exitForinitstatement(DartParser.ForinitstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(DartParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(DartParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#decFun}.
	 * @param ctx the parse tree
	 */
	void enterDecFun(DartParser.DecFunContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#decFun}.
	 * @param ctx the parse tree
	 */
	void exitDecFun(DartParser.DecFunContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#arrowFunction}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunction(DartParser.ArrowFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#arrowFunction}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunction(DartParser.ArrowFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#anonymousFunction}.
	 * @param ctx the parse tree
	 */
	void enterAnonymousFunction(DartParser.AnonymousFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#anonymousFunction}.
	 * @param ctx the parse tree
	 */
	void exitAnonymousFunction(DartParser.AnonymousFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#arrowAndAnonFun}.
	 * @param ctx the parse tree
	 */
	void enterArrowAndAnonFun(DartParser.ArrowAndAnonFunContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#arrowAndAnonFun}.
	 * @param ctx the parse tree
	 */
	void exitArrowAndAnonFun(DartParser.ArrowAndAnonFunContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#returnType}.
	 * @param ctx the parse tree
	 */
	void enterReturnType(DartParser.ReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#returnType}.
	 * @param ctx the parse tree
	 */
	void exitReturnType(DartParser.ReturnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#parameterMethods}.
	 * @param ctx the parse tree
	 */
	void enterParameterMethods(DartParser.ParameterMethodsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#parameterMethods}.
	 * @param ctx the parse tree
	 */
	void exitParameterMethods(DartParser.ParameterMethodsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(DartParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(DartParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(DartParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(DartParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#parameterFun}.
	 * @param ctx the parse tree
	 */
	void enterParameterFun(DartParser.ParameterFunContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#parameterFun}.
	 * @param ctx the parse tree
	 */
	void exitParameterFun(DartParser.ParameterFunContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#parametersDeclareFun}.
	 * @param ctx the parse tree
	 */
	void enterParametersDeclareFun(DartParser.ParametersDeclareFunContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#parametersDeclareFun}.
	 * @param ctx the parse tree
	 */
	void exitParametersDeclareFun(DartParser.ParametersDeclareFunContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#parameterVariableWithDec}.
	 * @param ctx the parse tree
	 */
	void enterParameterVariableWithDec(DartParser.ParameterVariableWithDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#parameterVariableWithDec}.
	 * @param ctx the parse tree
	 */
	void exitParameterVariableWithDec(DartParser.ParameterVariableWithDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(DartParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(DartParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#return}.
	 * @param ctx the parse tree
	 */
	void enterReturn(DartParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#return}.
	 * @param ctx the parse tree
	 */
	void exitReturn(DartParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#methodBlock}.
	 * @param ctx the parse tree
	 */
	void enterMethodBlock(DartParser.MethodBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#methodBlock}.
	 * @param ctx the parse tree
	 */
	void exitMethodBlock(DartParser.MethodBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(DartParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(DartParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#switch_stat}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_stat(DartParser.Switch_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#switch_stat}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_stat(DartParser.Switch_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#switch_key}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_key(DartParser.Switch_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#switch_key}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_key(DartParser.Switch_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#switchBody}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBody(DartParser.SwitchBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#switchBody}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBody(DartParser.SwitchBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#case}.
	 * @param ctx the parse tree
	 */
	void enterCase(DartParser.CaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#case}.
	 * @param ctx the parse tree
	 */
	void exitCase(DartParser.CaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#default}.
	 * @param ctx the parse tree
	 */
	void enterDefault(DartParser.DefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#default}.
	 * @param ctx the parse tree
	 */
	void exitDefault(DartParser.DefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(DartParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(DartParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(DartParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(DartParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(DartParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(DartParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#constructor}.
	 * @param ctx the parse tree
	 */
	void enterConstructor(DartParser.ConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#constructor}.
	 * @param ctx the parse tree
	 */
	void exitConstructor(DartParser.ConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#defConstructor}.
	 * @param ctx the parse tree
	 */
	void enterDefConstructor(DartParser.DefConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#defConstructor}.
	 * @param ctx the parse tree
	 */
	void exitDefConstructor(DartParser.DefConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#withConstructors}.
	 * @param ctx the parse tree
	 */
	void enterWithConstructors(DartParser.WithConstructorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#withConstructors}.
	 * @param ctx the parse tree
	 */
	void exitWithConstructors(DartParser.WithConstructorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#superclass}.
	 * @param ctx the parse tree
	 */
	void enterSuperclass(DartParser.SuperclassContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#superclass}.
	 * @param ctx the parse tree
	 */
	void exitSuperclass(DartParser.SuperclassContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#interfaces}.
	 * @param ctx the parse tree
	 */
	void enterInterfaces(DartParser.InterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#interfaces}.
	 * @param ctx the parse tree
	 */
	void exitInterfaces(DartParser.InterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#typeNotVoid}.
	 * @param ctx the parse tree
	 */
	void enterTypeNotVoid(DartParser.TypeNotVoidContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#typeNotVoid}.
	 * @param ctx the parse tree
	 */
	void exitTypeNotVoid(DartParser.TypeNotVoidContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#typeNotVoidList}.
	 * @param ctx the parse tree
	 */
	void enterTypeNotVoidList(DartParser.TypeNotVoidListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#typeNotVoidList}.
	 * @param ctx the parse tree
	 */
	void exitTypeNotVoidList(DartParser.TypeNotVoidListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#mixins}.
	 * @param ctx the parse tree
	 */
	void enterMixins(DartParser.MixinsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#mixins}.
	 * @param ctx the parse tree
	 */
	void exitMixins(DartParser.MixinsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#metadata}.
	 * @param ctx the parse tree
	 */
	void enterMetadata(DartParser.MetadataContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#metadata}.
	 * @param ctx the parse tree
	 */
	void exitMetadata(DartParser.MetadataContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#metadatum}.
	 * @param ctx the parse tree
	 */
	void enterMetadatum(DartParser.MetadatumContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#metadatum}.
	 * @param ctx the parse tree
	 */
	void exitMetadatum(DartParser.MetadatumContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(DartParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(DartParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(DartParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(DartParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(DartParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(DartParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(DartParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(DartParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#objectClass}.
	 * @param ctx the parse tree
	 */
	void enterObjectClass(DartParser.ObjectClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#objectClass}.
	 * @param ctx the parse tree
	 */
	void exitObjectClass(DartParser.ObjectClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#objectParameter}.
	 * @param ctx the parse tree
	 */
	void enterObjectParameter(DartParser.ObjectParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#objectParameter}.
	 * @param ctx the parse tree
	 */
	void exitObjectParameter(DartParser.ObjectParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#objectParameters}.
	 * @param ctx the parse tree
	 */
	void enterObjectParameters(DartParser.ObjectParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#objectParameters}.
	 * @param ctx the parse tree
	 */
	void exitObjectParameters(DartParser.ObjectParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#objectProperty}.
	 * @param ctx the parse tree
	 */
	void enterObjectProperty(DartParser.ObjectPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#objectProperty}.
	 * @param ctx the parse tree
	 */
	void exitObjectProperty(DartParser.ObjectPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#objectMethod}.
	 * @param ctx the parse tree
	 */
	void enterObjectMethod(DartParser.ObjectMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#objectMethod}.
	 * @param ctx the parse tree
	 */
	void exitObjectMethod(DartParser.ObjectMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#callObject}.
	 * @param ctx the parse tree
	 */
	void enterCallObject(DartParser.CallObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#callObject}.
	 * @param ctx the parse tree
	 */
	void exitCallObject(DartParser.CallObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#objectDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterObjectDeclaration(DartParser.ObjectDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#objectDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitObjectDeclaration(DartParser.ObjectDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(DartParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(DartParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#const}.
	 * @param ctx the parse tree
	 */
	void enterConst(DartParser.ConstContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#const}.
	 * @param ctx the parse tree
	 */
	void exitConst(DartParser.ConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#decVar}.
	 * @param ctx the parse tree
	 */
	void enterDecVar(DartParser.DecVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#decVar}.
	 * @param ctx the parse tree
	 */
	void exitDecVar(DartParser.DecVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intNumber}
	 * labeled alternative in {@link DartParser#num}.
	 * @param ctx the parse tree
	 */
	void enterIntNumber(DartParser.IntNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intNumber}
	 * labeled alternative in {@link DartParser#num}.
	 * @param ctx the parse tree
	 */
	void exitIntNumber(DartParser.IntNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code floatNumber}
	 * labeled alternative in {@link DartParser#num}.
	 * @param ctx the parse tree
	 */
	void enterFloatNumber(DartParser.FloatNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code floatNumber}
	 * labeled alternative in {@link DartParser#num}.
	 * @param ctx the parse tree
	 */
	void exitFloatNumber(DartParser.FloatNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doubleNumber}
	 * labeled alternative in {@link DartParser#num}.
	 * @param ctx the parse tree
	 */
	void enterDoubleNumber(DartParser.DoubleNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doubleNumber}
	 * labeled alternative in {@link DartParser#num}.
	 * @param ctx the parse tree
	 */
	void exitDoubleNumber(DartParser.DoubleNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#this}.
	 * @param ctx the parse tree
	 */
	void enterThis(DartParser.ThisContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#this}.
	 * @param ctx the parse tree
	 */
	void exitThis(DartParser.ThisContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(DartParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(DartParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#data}.
	 * @param ctx the parse tree
	 */
	void enterData(DartParser.DataContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#data}.
	 * @param ctx the parse tree
	 */
	void exitData(DartParser.DataContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#comparsion}.
	 * @param ctx the parse tree
	 */
	void enterComparsion(DartParser.ComparsionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#comparsion}.
	 * @param ctx the parse tree
	 */
	void exitComparsion(DartParser.ComparsionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#logical}.
	 * @param ctx the parse tree
	 */
	void enterLogical(DartParser.LogicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#logical}.
	 * @param ctx the parse tree
	 */
	void exitLogical(DartParser.LogicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(DartParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(DartParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(DartParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(DartParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#nameType}.
	 * @param ctx the parse tree
	 */
	void enterNameType(DartParser.NameTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#nameType}.
	 * @param ctx the parse tree
	 */
	void exitNameType(DartParser.NameTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#objectType}.
	 * @param ctx the parse tree
	 */
	void enterObjectType(DartParser.ObjectTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#objectType}.
	 * @param ctx the parse tree
	 */
	void exitObjectType(DartParser.ObjectTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#type_ID}.
	 * @param ctx the parse tree
	 */
	void enterType_ID(DartParser.Type_IDContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#type_ID}.
	 * @param ctx the parse tree
	 */
	void exitType_ID(DartParser.Type_IDContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#identi}.
	 * @param ctx the parse tree
	 */
	void enterIdenti(DartParser.IdentiContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#identi}.
	 * @param ctx the parse tree
	 */
	void exitIdenti(DartParser.IdentiContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#widget}.
	 * @param ctx the parse tree
	 */
	void enterWidget(DartParser.WidgetContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#widget}.
	 * @param ctx the parse tree
	 */
	void exitWidget(DartParser.WidgetContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#listOfWidget}.
	 * @param ctx the parse tree
	 */
	void enterListOfWidget(DartParser.ListOfWidgetContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#listOfWidget}.
	 * @param ctx the parse tree
	 */
	void exitListOfWidget(DartParser.ListOfWidgetContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#container}.
	 * @param ctx the parse tree
	 */
	void enterContainer(DartParser.ContainerContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#container}.
	 * @param ctx the parse tree
	 */
	void exitContainer(DartParser.ContainerContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#child}.
	 * @param ctx the parse tree
	 */
	void enterChild(DartParser.ChildContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#child}.
	 * @param ctx the parse tree
	 */
	void exitChild(DartParser.ChildContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#width}.
	 * @param ctx the parse tree
	 */
	void enterWidth(DartParser.WidthContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#width}.
	 * @param ctx the parse tree
	 */
	void exitWidth(DartParser.WidthContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#height}.
	 * @param ctx the parse tree
	 */
	void enterHeight(DartParser.HeightContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#height}.
	 * @param ctx the parse tree
	 */
	void exitHeight(DartParser.HeightContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#padding}.
	 * @param ctx the parse tree
	 */
	void enterPadding(DartParser.PaddingContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#padding}.
	 * @param ctx the parse tree
	 */
	void exitPadding(DartParser.PaddingContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#margin}.
	 * @param ctx the parse tree
	 */
	void enterMargin(DartParser.MarginContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#margin}.
	 * @param ctx the parse tree
	 */
	void exitMargin(DartParser.MarginContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#edgeInsets}.
	 * @param ctx the parse tree
	 */
	void enterEdgeInsets(DartParser.EdgeInsetsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#edgeInsets}.
	 * @param ctx the parse tree
	 */
	void exitEdgeInsets(DartParser.EdgeInsetsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#edgeInsets_symmetric}.
	 * @param ctx the parse tree
	 */
	void enterEdgeInsets_symmetric(DartParser.EdgeInsets_symmetricContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#edgeInsets_symmetric}.
	 * @param ctx the parse tree
	 */
	void exitEdgeInsets_symmetric(DartParser.EdgeInsets_symmetricContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#edgeInsets_all}.
	 * @param ctx the parse tree
	 */
	void enterEdgeInsets_all(DartParser.EdgeInsets_allContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#edgeInsets_all}.
	 * @param ctx the parse tree
	 */
	void exitEdgeInsets_all(DartParser.EdgeInsets_allContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#horizontal}.
	 * @param ctx the parse tree
	 */
	void enterHorizontal(DartParser.HorizontalContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#horizontal}.
	 * @param ctx the parse tree
	 */
	void exitHorizontal(DartParser.HorizontalContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#vertical}.
	 * @param ctx the parse tree
	 */
	void enterVertical(DartParser.VerticalContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#vertical}.
	 * @param ctx the parse tree
	 */
	void exitVertical(DartParser.VerticalContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#alignment}.
	 * @param ctx the parse tree
	 */
	void enterAlignment(DartParser.AlignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#alignment}.
	 * @param ctx the parse tree
	 */
	void exitAlignment(DartParser.AlignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#alignmentX}.
	 * @param ctx the parse tree
	 */
	void enterAlignmentX(DartParser.AlignmentXContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#alignmentX}.
	 * @param ctx the parse tree
	 */
	void exitAlignmentX(DartParser.AlignmentXContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#alignmentY}.
	 * @param ctx the parse tree
	 */
	void enterAlignmentY(DartParser.AlignmentYContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#alignmentY}.
	 * @param ctx the parse tree
	 */
	void exitAlignmentY(DartParser.AlignmentYContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#color}.
	 * @param ctx the parse tree
	 */
	void enterColor(DartParser.ColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#color}.
	 * @param ctx the parse tree
	 */
	void exitColor(DartParser.ColorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#colorName}.
	 * @param ctx the parse tree
	 */
	void enterColorName(DartParser.ColorNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#colorName}.
	 * @param ctx the parse tree
	 */
	void exitColorName(DartParser.ColorNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#colorHEX}.
	 * @param ctx the parse tree
	 */
	void enterColorHEX(DartParser.ColorHEXContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#colorHEX}.
	 * @param ctx the parse tree
	 */
	void exitColorHEX(DartParser.ColorHEXContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#colorRGB}.
	 * @param ctx the parse tree
	 */
	void enterColorRGB(DartParser.ColorRGBContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#colorRGB}.
	 * @param ctx the parse tree
	 */
	void exitColorRGB(DartParser.ColorRGBContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#colorHSV}.
	 * @param ctx the parse tree
	 */
	void enterColorHSV(DartParser.ColorHSVContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#colorHSV}.
	 * @param ctx the parse tree
	 */
	void exitColorHSV(DartParser.ColorHSVContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(DartParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(DartParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#text_data}.
	 * @param ctx the parse tree
	 */
	void enterText_data(DartParser.Text_dataContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#text_data}.
	 * @param ctx the parse tree
	 */
	void exitText_data(DartParser.Text_dataContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#style}.
	 * @param ctx the parse tree
	 */
	void enterStyle(DartParser.StyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#style}.
	 * @param ctx the parse tree
	 */
	void exitStyle(DartParser.StyleContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#strutStyle}.
	 * @param ctx the parse tree
	 */
	void enterStrutStyle(DartParser.StrutStyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#strutStyle}.
	 * @param ctx the parse tree
	 */
	void exitStrutStyle(DartParser.StrutStyleContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#textAlign}.
	 * @param ctx the parse tree
	 */
	void enterTextAlign(DartParser.TextAlignContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#textAlign}.
	 * @param ctx the parse tree
	 */
	void exitTextAlign(DartParser.TextAlignContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#textDirection}.
	 * @param ctx the parse tree
	 */
	void enterTextDirection(DartParser.TextDirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#textDirection}.
	 * @param ctx the parse tree
	 */
	void exitTextDirection(DartParser.TextDirectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#locale}.
	 * @param ctx the parse tree
	 */
	void enterLocale(DartParser.LocaleContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#locale}.
	 * @param ctx the parse tree
	 */
	void exitLocale(DartParser.LocaleContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#aspectRatio}.
	 * @param ctx the parse tree
	 */
	void enterAspectRatio(DartParser.AspectRatioContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#aspectRatio}.
	 * @param ctx the parse tree
	 */
	void exitAspectRatio(DartParser.AspectRatioContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#fontFamily}.
	 * @param ctx the parse tree
	 */
	void enterFontFamily(DartParser.FontFamilyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#fontFamily}.
	 * @param ctx the parse tree
	 */
	void exitFontFamily(DartParser.FontFamilyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#fontSize}.
	 * @param ctx the parse tree
	 */
	void enterFontSize(DartParser.FontSizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#fontSize}.
	 * @param ctx the parse tree
	 */
	void exitFontSize(DartParser.FontSizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#maxLines}.
	 * @param ctx the parse tree
	 */
	void enterMaxLines(DartParser.MaxLinesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#maxLines}.
	 * @param ctx the parse tree
	 */
	void exitMaxLines(DartParser.MaxLinesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#sizedBox}.
	 * @param ctx the parse tree
	 */
	void enterSizedBox(DartParser.SizedBoxContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#sizedBox}.
	 * @param ctx the parse tree
	 */
	void exitSizedBox(DartParser.SizedBoxContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#size}.
	 * @param ctx the parse tree
	 */
	void enterSize(DartParser.SizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#size}.
	 * @param ctx the parse tree
	 */
	void exitSize(DartParser.SizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#size2}.
	 * @param ctx the parse tree
	 */
	void enterSize2(DartParser.Size2Context ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#size2}.
	 * @param ctx the parse tree
	 */
	void exitSize2(DartParser.Size2Context ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(DartParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(DartParser.RowContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#column}.
	 * @param ctx the parse tree
	 */
	void enterColumn(DartParser.ColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#column}.
	 * @param ctx the parse tree
	 */
	void exitColumn(DartParser.ColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#align}.
	 * @param ctx the parse tree
	 */
	void enterAlign(DartParser.AlignContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#align}.
	 * @param ctx the parse tree
	 */
	void exitAlign(DartParser.AlignContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#crossAxisAlignment}.
	 * @param ctx the parse tree
	 */
	void enterCrossAxisAlignment(DartParser.CrossAxisAlignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#crossAxisAlignment}.
	 * @param ctx the parse tree
	 */
	void exitCrossAxisAlignment(DartParser.CrossAxisAlignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#mainAxisAlignment}.
	 * @param ctx the parse tree
	 */
	void enterMainAxisAlignment(DartParser.MainAxisAlignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#mainAxisAlignment}.
	 * @param ctx the parse tree
	 */
	void exitMainAxisAlignment(DartParser.MainAxisAlignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#spacing}.
	 * @param ctx the parse tree
	 */
	void enterSpacing(DartParser.SpacingContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#spacing}.
	 * @param ctx the parse tree
	 */
	void exitSpacing(DartParser.SpacingContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#direction}.
	 * @param ctx the parse tree
	 */
	void enterDirection(DartParser.DirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#direction}.
	 * @param ctx the parse tree
	 */
	void exitDirection(DartParser.DirectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#verticalDirection}.
	 * @param ctx the parse tree
	 */
	void enterVerticalDirection(DartParser.VerticalDirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#verticalDirection}.
	 * @param ctx the parse tree
	 */
	void exitVerticalDirection(DartParser.VerticalDirectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#childrenOfRow}.
	 * @param ctx the parse tree
	 */
	void enterChildrenOfRow(DartParser.ChildrenOfRowContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#childrenOfRow}.
	 * @param ctx the parse tree
	 */
	void exitChildrenOfRow(DartParser.ChildrenOfRowContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#childrenOfColumn}.
	 * @param ctx the parse tree
	 */
	void enterChildrenOfColumn(DartParser.ChildrenOfColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#childrenOfColumn}.
	 * @param ctx the parse tree
	 */
	void exitChildrenOfColumn(DartParser.ChildrenOfColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#singleChildScrollView}.
	 * @param ctx the parse tree
	 */
	void enterSingleChildScrollView(DartParser.SingleChildScrollViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#singleChildScrollView}.
	 * @param ctx the parse tree
	 */
	void exitSingleChildScrollView(DartParser.SingleChildScrollViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#scrollDirection}.
	 * @param ctx the parse tree
	 */
	void enterScrollDirection(DartParser.ScrollDirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#scrollDirection}.
	 * @param ctx the parse tree
	 */
	void exitScrollDirection(DartParser.ScrollDirectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#paddingWidget}.
	 * @param ctx the parse tree
	 */
	void enterPaddingWidget(DartParser.PaddingWidgetContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#paddingWidget}.
	 * @param ctx the parse tree
	 */
	void exitPaddingWidget(DartParser.PaddingWidgetContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#paddingSize}.
	 * @param ctx the parse tree
	 */
	void enterPaddingSize(DartParser.PaddingSizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#paddingSize}.
	 * @param ctx the parse tree
	 */
	void exitPaddingSize(DartParser.PaddingSizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#scaffold}.
	 * @param ctx the parse tree
	 */
	void enterScaffold(DartParser.ScaffoldContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#scaffold}.
	 * @param ctx the parse tree
	 */
	void exitScaffold(DartParser.ScaffoldContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(DartParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(DartParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#appBar}.
	 * @param ctx the parse tree
	 */
	void enterAppBar(DartParser.AppBarContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#appBar}.
	 * @param ctx the parse tree
	 */
	void exitAppBar(DartParser.AppBarContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#title}.
	 * @param ctx the parse tree
	 */
	void enterTitle(DartParser.TitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#title}.
	 * @param ctx the parse tree
	 */
	void exitTitle(DartParser.TitleContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#floatingActionButton}.
	 * @param ctx the parse tree
	 */
	void enterFloatingActionButton(DartParser.FloatingActionButtonContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#floatingActionButton}.
	 * @param ctx the parse tree
	 */
	void exitFloatingActionButton(DartParser.FloatingActionButtonContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#onPressed}.
	 * @param ctx the parse tree
	 */
	void enterOnPressed(DartParser.OnPressedContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#onPressed}.
	 * @param ctx the parse tree
	 */
	void exitOnPressed(DartParser.OnPressedContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#center}.
	 * @param ctx the parse tree
	 */
	void enterCenter(DartParser.CenterContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#center}.
	 * @param ctx the parse tree
	 */
	void exitCenter(DartParser.CenterContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#materialApp}.
	 * @param ctx the parse tree
	 */
	void enterMaterialApp(DartParser.MaterialAppContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#materialApp}.
	 * @param ctx the parse tree
	 */
	void exitMaterialApp(DartParser.MaterialAppContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#materialTitle}.
	 * @param ctx the parse tree
	 */
	void enterMaterialTitle(DartParser.MaterialTitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#materialTitle}.
	 * @param ctx the parse tree
	 */
	void exitMaterialTitle(DartParser.MaterialTitleContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#home}.
	 * @param ctx the parse tree
	 */
	void enterHome(DartParser.HomeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#home}.
	 * @param ctx the parse tree
	 */
	void exitHome(DartParser.HomeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#image}.
	 * @param ctx the parse tree
	 */
	void enterImage(DartParser.ImageContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#image}.
	 * @param ctx the parse tree
	 */
	void exitImage(DartParser.ImageContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#image_provider}.
	 * @param ctx the parse tree
	 */
	void enterImage_provider(DartParser.Image_providerContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#image_provider}.
	 * @param ctx the parse tree
	 */
	void exitImage_provider(DartParser.Image_providerContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#assetImage}.
	 * @param ctx the parse tree
	 */
	void enterAssetImage(DartParser.AssetImageContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#assetImage}.
	 * @param ctx the parse tree
	 */
	void exitAssetImage(DartParser.AssetImageContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#networkImage}.
	 * @param ctx the parse tree
	 */
	void enterNetworkImage(DartParser.NetworkImageContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#networkImage}.
	 * @param ctx the parse tree
	 */
	void exitNetworkImage(DartParser.NetworkImageContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#fileImage}.
	 * @param ctx the parse tree
	 */
	void enterFileImage(DartParser.FileImageContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#fileImage}.
	 * @param ctx the parse tree
	 */
	void exitFileImage(DartParser.FileImageContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#navigator}.
	 * @param ctx the parse tree
	 */
	void enterNavigator(DartParser.NavigatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#navigator}.
	 * @param ctx the parse tree
	 */
	void exitNavigator(DartParser.NavigatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#textFiled}.
	 * @param ctx the parse tree
	 */
	void enterTextFiled(DartParser.TextFiledContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#textFiled}.
	 * @param ctx the parse tree
	 */
	void exitTextFiled(DartParser.TextFiledContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(DartParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(DartParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#inputDecoration}.
	 * @param ctx the parse tree
	 */
	void enterInputDecoration(DartParser.InputDecorationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#inputDecoration}.
	 * @param ctx the parse tree
	 */
	void exitInputDecoration(DartParser.InputDecorationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(DartParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(DartParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#controller}.
	 * @param ctx the parse tree
	 */
	void enterController(DartParser.ControllerContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#controller}.
	 * @param ctx the parse tree
	 */
	void exitController(DartParser.ControllerContext ctx);
}