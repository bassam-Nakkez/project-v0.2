// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DartParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DartParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DartParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(DartParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(DartParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#imports}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImports(DartParser.ImportsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(DartParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(DartParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#if_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stat(DartParser.If_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#stat_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_block(DartParser.Stat_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#loops}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoops(DartParser.LoopsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#while_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stat(DartParser.While_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#do_while_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while_stat(DartParser.Do_while_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(DartParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(DartParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#decArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecArray(DartParser.DecArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#decpartArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecpartArray(DartParser.DecpartArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#anonArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonArray(DartParser.AnonArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#arraybody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArraybody(DartParser.ArraybodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#callArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallArray(DartParser.CallArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#callFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallFunction(DartParser.CallFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#incrementVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrementVariable(DartParser.IncrementVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#decrementVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecrementVariable(DartParser.DecrementVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forStatement}
	 * labeled alternative in {@link DartParser#for_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(DartParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#forinitstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForinitstatement(DartParser.ForinitstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(DartParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#decFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecFun(DartParser.DecFunContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#arrowFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowFunction(DartParser.ArrowFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#anonymousFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonymousFunction(DartParser.AnonymousFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#arrowAndAnonFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowAndAnonFun(DartParser.ArrowAndAnonFunContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#returnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnType(DartParser.ReturnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#parameterMethods}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterMethods(DartParser.ParameterMethodsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(DartParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(DartParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#parameterFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterFun(DartParser.ParameterFunContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#parametersDeclareFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametersDeclareFun(DartParser.ParametersDeclareFunContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#parameterVariableWithDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterVariableWithDec(DartParser.ParameterVariableWithDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(DartParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(DartParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#methodBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBlock(DartParser.MethodBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(DartParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#switch_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_stat(DartParser.Switch_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#switch_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_key(DartParser.Switch_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#switchBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBody(DartParser.SwitchBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase(DartParser.CaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault(DartParser.DefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(DartParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(DartParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(DartParser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor(DartParser.ConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#defConstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefConstructor(DartParser.DefConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#withConstructors}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithConstructors(DartParser.WithConstructorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#superclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperclass(DartParser.SuperclassContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#interfaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaces(DartParser.InterfacesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#typeNotVoid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeNotVoid(DartParser.TypeNotVoidContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#typeNotVoidList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeNotVoidList(DartParser.TypeNotVoidListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#mixins}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMixins(DartParser.MixinsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#metadata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetadata(DartParser.MetadataContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#metadatum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetadatum(DartParser.MetadatumContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(DartParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(DartParser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(DartParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(DartParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#objectClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectClass(DartParser.ObjectClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#objectParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectParameter(DartParser.ObjectParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#objectParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectParameters(DartParser.ObjectParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#objectProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectProperty(DartParser.ObjectPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#objectMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectMethod(DartParser.ObjectMethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#callObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallObject(DartParser.CallObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#objectDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectDeclaration(DartParser.ObjectDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(DartParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#const}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst(DartParser.ConstContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#decVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecVar(DartParser.DecVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intNumber}
	 * labeled alternative in {@link DartParser#num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntNumber(DartParser.IntNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code floatNumber}
	 * labeled alternative in {@link DartParser#num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatNumber(DartParser.FloatNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doubleNumber}
	 * labeled alternative in {@link DartParser#num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleNumber(DartParser.DoubleNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#this}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThis(DartParser.ThisContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(DartParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData(DartParser.DataContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#comparsion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparsion(DartParser.ComparsionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#logical}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical(DartParser.LogicalContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(DartParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(DartParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#nameType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameType(DartParser.NameTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#objectType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectType(DartParser.ObjectTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#type_ID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_ID(DartParser.Type_IDContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#identi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdenti(DartParser.IdentiContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#widget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidget(DartParser.WidgetContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#listOfWidget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListOfWidget(DartParser.ListOfWidgetContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#container}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainer(DartParser.ContainerContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#child}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChild(DartParser.ChildContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#width}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidth(DartParser.WidthContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#height}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeight(DartParser.HeightContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#padding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPadding(DartParser.PaddingContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#margin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMargin(DartParser.MarginContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#edgeInsets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdgeInsets(DartParser.EdgeInsetsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#edgeInsets_symmetric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdgeInsets_symmetric(DartParser.EdgeInsets_symmetricContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#edgeInsets_all}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdgeInsets_all(DartParser.EdgeInsets_allContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#horizontal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHorizontal(DartParser.HorizontalContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#vertical}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVertical(DartParser.VerticalContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#alignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlignment(DartParser.AlignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#alignmentX}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlignmentX(DartParser.AlignmentXContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#alignmentY}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlignmentY(DartParser.AlignmentYContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#color}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColor(DartParser.ColorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#colorName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColorName(DartParser.ColorNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#colorHEX}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColorHEX(DartParser.ColorHEXContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#colorRGB}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColorRGB(DartParser.ColorRGBContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#colorHSV}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColorHSV(DartParser.ColorHSVContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(DartParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#text_data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText_data(DartParser.Text_dataContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#style}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyle(DartParser.StyleContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#strutStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrutStyle(DartParser.StrutStyleContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#textAlign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextAlign(DartParser.TextAlignContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#textDirection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextDirection(DartParser.TextDirectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#locale}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocale(DartParser.LocaleContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#aspectRatio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAspectRatio(DartParser.AspectRatioContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#fontFamily}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFontFamily(DartParser.FontFamilyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#fontSize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFontSize(DartParser.FontSizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#maxLines}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaxLines(DartParser.MaxLinesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#sizedBox}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSizedBox(DartParser.SizedBoxContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#size}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSize(DartParser.SizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#size2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSize2(DartParser.Size2Context ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow(DartParser.RowContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn(DartParser.ColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#align}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlign(DartParser.AlignContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#crossAxisAlignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrossAxisAlignment(DartParser.CrossAxisAlignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#mainAxisAlignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainAxisAlignment(DartParser.MainAxisAlignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#spacing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpacing(DartParser.SpacingContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#direction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirection(DartParser.DirectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#verticalDirection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerticalDirection(DartParser.VerticalDirectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#childrenOfRow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChildrenOfRow(DartParser.ChildrenOfRowContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#childrenOfColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChildrenOfColumn(DartParser.ChildrenOfColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#singleChildScrollView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleChildScrollView(DartParser.SingleChildScrollViewContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#scrollDirection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScrollDirection(DartParser.ScrollDirectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#paddingWidget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPaddingWidget(DartParser.PaddingWidgetContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#paddingSize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPaddingSize(DartParser.PaddingSizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#scaffold}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScaffold(DartParser.ScaffoldContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(DartParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#appBar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppBar(DartParser.AppBarContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#title}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitle(DartParser.TitleContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#floatingActionButton}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatingActionButton(DartParser.FloatingActionButtonContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#onPressed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnPressed(DartParser.OnPressedContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#center}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCenter(DartParser.CenterContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#materialApp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaterialApp(DartParser.MaterialAppContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#materialTitle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaterialTitle(DartParser.MaterialTitleContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#home}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHome(DartParser.HomeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#image}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImage(DartParser.ImageContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#image_provider}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImage_provider(DartParser.Image_providerContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#assetImage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssetImage(DartParser.AssetImageContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#networkImage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNetworkImage(DartParser.NetworkImageContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#fileImage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileImage(DartParser.FileImageContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#navigator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNavigator(DartParser.NavigatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#textFiled}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextFiled(DartParser.TextFiledContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(DartParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#inputDecoration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputDecoration(DartParser.InputDecorationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(DartParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#controller}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitController(DartParser.ControllerContext ctx);
}