parser grammar DartParser;

options { tokenVocab = DartLexer ; }



parse
 : block  EOF
 ;




block
 : stat*
 ;


imports: IMPORT STRING_singl;



stat
 :call SCO
 |declaration
 |assignment SCO
 |if_stat
 |loops
 |switch_stat
 |imports* SCO
 |widget
 |navigator
 ;



declaration
        : classDeclaration
        | decVar SCO
        | decFun
        | objectDeclaration SCO
        | array SCO
        | const
        ;



if_stat
 : IF OP condition CP stat_block (ELSE IF condition stat_block )* (ELSE stat_block)?
 ;



stat_block
 : START block (BREAK SCO)? return? END
 | stat (return)?
 | return
 ;




loops
     : do_while_stat
     | while_stat
     | for_stat
     ;



while_stat
 : WHILE OP condition CP stat_block
 ;



do_while_stat
 : DO  stat_block WHILE OP condition CP
 ;



call
      : objectMethod
      | objectClass
      | callFunction
      | objectProperty
      | callObject
      | objectParameter
      | incrementVariable
      | decrementVariable
      | callArray
      ;


array
        : (decArray) | (decpartArray E arraybody*)
        ;


        decArray
        : nameType ID  (OB expr CB )*
        ;


        decpartArray
        : nameType ID
        ;

anonArray: OB call (COM call)* ;

        arraybody
        : OB INT_NUM (COM INT_NUM )* CB
        | OB FLOAT_NUM (COM FLOAT_NUM )* CB
        | OB STRING (COM STRING )* CB
        | OB BOOLE_TYPE (COM BOOLE_TYPE )* CB
        | OB ID (COM ID)* CB
        ;

//arrayCall : ID OB expr (COM expr)* CB (OOB expr (COM expr))* ;

callArray: ID  arraybody  arraybody*;

callFunction : NEW? ID OP parameters CP (DOT call)* | ID OP CP (DOT call)*;


incrementVariable : ID PP ;
decrementVariable :ID MINMIN;

for_stat : FOR OP forinitstatement? SCO condition? SCO (expr|incrementVariable |decrementVariable)? CP stat_block  #forStatement;
forinitstatement : decVar | assignment;
condition: comparsion | logical | BOOLE_TYPE | ID | call;

decFun : returnType ID  OP parametersDeclareFun* CP functionBody | arrowFunction;
arrowFunction : returnType ID ARROW functionBody  ;
anonymousFunction : OP CP functionBody | functionBody ;

arrowAndAnonFun:OP CP ARROW call |anonymousFunction | arrowFunction ;

returnType: nameType | VOID ;
parameterMethods : OP parameters  CP;

/// parameter Call function >>-----------------

parameter : decVar | (BOOLE_TYPE | expr)?  | declaration | call ;
parameters: parameter (COM parameter)* ;

/// Patrameter Declaration function >>-----------------

parameterFun : parameterVariableWithDec | this ;
parametersDeclareFun: parameterFun (COM parameterFun)* ;
parameterVariableWithDec: nameType ID (E expr)?;


functionBody : stat_block;
return : RETURN NEW? ( objectClass| expr | call| widget )  ;
methodBlock : stat |this ;
methodBody:  START  methodBlock*  ( return )* END;


switch_stat : SWITCH OP switch_key CP switchBody;
switch_key : ID | INT_NUM;
switchBody: START case+ default?  END ;
case : CASE  (data)  CO  ( block   (BREAK SCO)* | return SCO)  ;
default: DEFAULT CO ( block (BREAK SCO)* | return );
 // -------------------- <<  CLass >>-----------------

classDeclaration : ABSTRACT? CLASS type_ID typeParameters? superclass?  interfaces? START classBody END ;

property : decVar SCO ;
method : (returnType| ID) ID parameterMethods methodBody ;
constructor : ID parameterMethods+ methodBody  ;
defConstructor: ID OP CP functionBody;
withConstructors: constructor? (  ( OVERRIDE?  method )+ | property )* defConstructor? |defConstructor? (  ( OVERRIDE?  method )+ | property )* constructor?;
superclass : EXTENDS typeNotVoid (LT ID GT)? mixins? | mixins ;
interfaces : IMPLEMENTS typeNotVoidList ;
typeNotVoid: ID Q?  | ID COM ID ;
typeNotVoidList: typeNotVoid (  typeNotVoid )*;
mixins: WITH typeNotVoidList ;
metadata: ( AT metadatum )* ;
metadatum: identi | qualifiedName ;
typeParameter: metadata identi ( EXTENDS typeNotVoid )? ;
typeParameters: LT typeParameter ( COM typeParameter )* GT ;
qualifiedName: type_ID DOT identi | type_ID DOT type_ID DOT identi ;

cond: call Q call (CO call)?;


// ------------------------<<<  Object >>-----------------

	objectClass : CONST? NEW? ID OP (objectParameters)? CP;
//objectClass : CONST? NEW? ID OP (objectParameters |STRING_singl (COM objectParameters)?) CP;

objectParameter :ID CO NEW? (
                LT ID GT OB objectClass CB
                |ID? Q? objectClass
                |LT ID GT OB objectClass CB
                |data
                |call
                |anonArray COM?
                |arrowAndAnonFun
                |OB NEW? call (COM call )* CB
                |cond
                | FALSE
                |TRUE )
                ;

objectParameters : objectParameter ( COM objectParameter)* COM?;

objectProperty : ID DOT ID (DOT ID)*;
objectMethod : ID DOT callFunction;
callObject : objectClass;
objectDeclaration : ID objectClass;

classBody : (  ( OVERRIDE?  method )+ | property )* withConstructors? (  ( OVERRIDE?  method )+ | property )* ;


const: CONST ID ;

decVar
      : (CONST |FINAL? nameType ) ID (E (expr|bool|call))?  ;




num  :INT_NUM                   #intNumber
        |FLOAT_NUM              #floatNumber
        |DOUBLE_NUM             #doubleNumber
        ;

this :  THIS DOT call | THIS DOT ID;

expr
 : MIN expr
 | expr  MOD  expr
 | expr  DIV  expr
 | expr MUL  expr
 | expr  P expr
 | expr MIN  expr
 | OP expr CP
 |data
 |callArray
 ;

data
 :ID
 |STRING
 |STRING_singl
 |this
 |bool
 |num
 ;



 comparsion
 : expr LE expr
 | expr EGT expr
 | expr LT expr
 | expr GT expr
 | expr EE expr
 | expr NE expr
 ;



 logical:
        OP logical CP
        |logical  op = (AA | OR)  logical
        |comparsion
        |BOOL_VALUE
        |NOT comparsion
        |ID;

 assignment
  : (ID | this) E expr
  | (ID | this) MULE expr
  | (ID | this) PE expr
  | (ID | this) MODE expr
  | (ID | this) MIE expr
  | (ID | this) SLE expr
  ;

bool : TRUE|FALSE;
nameType
        :INT_TYPE
        |BOOL_TYPE
        |STRING_TYPE
        |FLOAT_TYPE
        |DOUBLE_TYPE
        |VAR
        |objectType
        ;

objectType : ID;

//TYPE_ID
type_ID: ID| ASYNC | HIDE | OF | ON | SHOW | SYNC | AWAIT | YIELD | DYNAMIC | NATIVE | FUNCTION;


//IDENTI
identi
  : ID | ABSTRACT | AS | COVARIANT | DEFERRED | DYNAMIC | EXPORT | EXTERNAL| EXTENSION | FACTORY
  | FUNCTION | GET | IMPLEMENTS | IMPORT | INTERFACE | LATE
  | LIBRARY | MIXIN| OPERATOR | PART | REQUIRED | SET | STATIC | TYPEDEF | FUNCTION
  |ASYNC | HIDE | OF | ON | SHOW | SYNC | AWAIT | YIELD | DYNAMIC | NATIVE ;








//----------------- <<<<<(( Flutter ))>>>>> -------------


  widget: listOfWidget? SCO;

  listOfWidget: container COM?
          | sizedBox COM?
          | text  COM?
          | padding  COM?
          | row  COM?
          | column  COM?
          | singleChildScrollView  COM?
          | paddingWidget  COM?
          | center COM?
          | image
          | scaffold COM?
          | materialApp
          | textFiled COM?
        ;





//----------------- Container Widget and its parameters -------------

container : Container   width? height? (color COM? )? padding? margin? alignment? child? CP;

//semanticContainer?
//fit?
//overflow?
//Clip?
//constraints?



child :   Child listOfWidget COM?;
width:    Width (FLOAT_NUM| INT_NUM)  COM?;
height:   Height (FLOAT_NUM| INT_NUM)  COM?;

padding :PADDING( edgeInsets | edgeInsets_symmetric | edgeInsets_all);
margin :MARGIN( edgeInsets | edgeInsets_symmetric | edgeInsets_all);
edgeInsets :EdgeInsets OP TOP FLOAT_NUM COM Bottom FLOAT_NUM COM LEFT FLOAT_NUM COM RIGHT FLOAT_NUM CP COM?
           |EdgeInsets DOT OP horizontal? vertical?  CP COM?;
edgeInsets_symmetric : EdgeInsets_symmetric horizontal COM vertical CP COM?;
edgeInsets_all : EdgeInsets_all ( FLOAT_NUM| INT_NUM ) CP COM?;

horizontal: Horizontal ( FLOAT_NUM| INT_NUM ) COM?;
vertical:Vertical ( FLOAT_NUM| INT_NUM ) COM?;


alignment :AlignmentNamePro Alignment (alignmentX | alignmentY) COM?;

alignmentX : Center | Start | End | SpaceBetween | SpaceAround | SpaceEvenly;
alignmentY :TOP | Bottom | Center;

// Color parameter
color : colorName | colorHEX | colorRGB | colorHSV ;
colorName : ColorName Colors ID | ColorName Colors ID OP INT_NUM CP COM?;
colorHEX  : POUND HEXDIGIT HEXDIGIT HEXDIGIT HEXDIGIT COM?;
colorRGB  : COLOR INT_NUM COM INT_NUM COM INT_NUM CP COM?;
colorHSV  : ColorFromHSV (FLOAT_NUM| INT_NUM) COM (FLOAT_NUM| INT_NUM) COM (FLOAT_NUM| INT_NUM) CP COM?;


//----------------- text Widget and its parameters -------------

text : TEXT text_data style? strutStyle? textDirection? locale?  textAlign? maxLines?  CP;
text_data : (STRING_singl | ID ) COM?;

style :Style TextStyle
fontSize?
color? COM?
fontFamily?
height?
aspectRatio?
CP COM?;


strutStyle : StrutStyle height? aspectRatio? CP COM?;

textAlign :TextAlign ( Left | Right | Center | Justify | Start | End ) CP COM?;

textDirection : TextDirection ( LRL) CP COM?;

locale : Locale STRING CP;

aspectRatio:AspectRatio (FLOAT_NUM| INT_NUM) COM?;
fontFamily : FontFamily ID  COM?;
fontSize:FontSize (FLOAT_NUM| INT_NUM) COM?;

maxLines: MaxLines INT_NUM  COM?;



//----------------- SizeBox Widget and its parameters -------------


sizedBox : SizedBox size?  child? CP;

size : size2 ;

size2 : SizeName  Size OP  (FLOAT_NUM| INT_NUM) COM (FLOAT_NUM| INT_NUM) CP COM?
      | size2 OP width COM  height CP COM?
      | width?  (COM height)?
      | height? (COM width)?
      ;



//----------------- Column and ROW Widget and its parameters -------------

row : ROW OP align? spacing? padding? direction? childrenOfRow CP;
column :Column OP align? spacing? padding? direction? childrenOfColumn CP;

align : CrossAxisAlignment crossAxisAlignment COM? | MainAxisAlignment  mainAxisAlignment COM?;

crossAxisAlignment :CrossAxisAlignmentDOT (Center| Start | End  | Stretch) ;

mainAxisAlignment : MainAxisAlignmentDOT( Center| Start | End | SpaceBetween | SpaceAround | SpaceEvenly);

spacing : CrossAxisSpacing FLOAT_NUM COM? | MainAxisSpacing FLOAT_NUM  COM?;


direction : TextDirection textDirection COM? | VerticalDirection verticalDirection COM? ;

//EdgeInsets ::= EdgeInsets.all(DOUBLE) | EdgeInsets.symmetric(HORIZONTAL_DOUBLE, VERTICAL_DOUBLE) | EdgeInsets.fromLTRB(DOUBLE, DOUBLE, DOUBLE, DOUBLE)

verticalDirection : ( DOWN | UP ) ;

childrenOfRow : Children listOfWidget (COM listOfWidget)* ;
childrenOfColumn : Children listOfWidget (COM listOfWidget)* ;


//----------------- SingleChildScrollView Widget and its parameters -------------

singleChildScrollView : SingleChildScrollView OP scrollDirection? child CP;

scrollDirection : ScrollDirection horizontal | vertical;


//----------------- Padding Widget and its parameters -------------

paddingWidget : Padding OP   padding? COM? paddingSize?  child CP;

paddingSize : FLOAT_NUM | edgeInsets | ALL | Symmetric | HorizontalName | VerticalName | Only;

//----------------- Scaffold Widget and its parameters -------------


scaffold : Scaffold OP (FloatingActionButtonProp floatingActionButton)? appBar? body? CP ;

body: Body listOfWidget COM?;

appBar: AppBar AppBarPara title? CP COM?;

title: Title listOfWidget COM?;

floatingActionButton: FloatingActionButton OP onPressed color? child? CP COM?;
onPressed: OnPressed OP CP START block END COM? ;
center: CenterWidget OP child CP;

//----------------- MaterialApp Widget and its parameters -------------

materialApp : MaterialApp materialTitle?   home? CP ;
materialTitle: Title STRING_singl COM?;
home: Home widget;


///-------------- Image widget -------------------

image : Image OP  image_provider width? height?  alignment? color? padding? child? CP;
image_provider :ImageProp ( assetImage | networkImage | fileImage ) COM?;
assetImage : AssetImage STRING_singl CP;
networkImage : NetworkImage STRING_singl CP ;
fileImage : FileImage File OP STRING_singl CP ;

//-------------- Navigator widget  -------------------

navigator : NAVIGATOR DOT OF OP CONTEXT CP DOT PUSH OP MATERIALPAGEROUTE OP BUILDER CO OP CONTEXT CP ARROW objectClass CP COM;



//-------------- textFiled widget  -------------------

textFiled: TextFiled OP  attribute+ CP;
                          attribute: (width COM|inputDecoration COM|controller COM);
                          inputDecoration: INPUTDECORATION OP label CP;
                          label: LABELTEXT STRING;
                          controller: CONTROLLER ID;



