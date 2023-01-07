parser grammar DartParser;

options { tokenVocab = DartLexer ; }

parse
 : block  EOF
 ;

block
 : stat*
 ;


stat
 : assignment SCO
 | if_stat
 | loops
 | call SCO
 | incrementVar SCO
 | switch_stat
 | declaration
 ;


if_stat
 : IF OP condition CP stat_block (ELSE IF condition)* (ELSE stat_block)?
 ;


declaration
        :classDeclaration
        | decVar SCO
        | decFun
        |objectDeclaration SCO
        ;



stat_block
 : START block (BREAK SCO)? END
 | stat
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
      | callFunction
      | objectProperty
      | callObject
      | object
      ;

callFunction : ID OP parameters CP (DOT call)*;


incrementVar : ID PP | ID MINMIN;

for_stat : FOR OP forinitstatement? SCO condition? SCO (expr|incrementVar)? CP stat_block     #ClassicForStatement;
forinitstatement : decVar | assignment;
condition: comparison | logical | boolValue | ID | call;

decFun : returnType funName parameterPartDec functionBody | arrowFunction;
arrowFunction : returnType ID ARROW functionBody ;
anonymousFunction : OP CP functionBody ;
funName : ID ;

returnType: variableType | VOID ;
parameterPart : OP parameters  CP;

parameter : variableType ID (E (expr| boolValue))? | (boolValue | expr)?  | declaration | call ;

parameters: parameter (COM parameter)* ;

parameterPartDec : OP parametersDec*  CP;

parameterDec : variableType ID (E expr)? | ID | this ;

parametersDec: parameterDec (COM parameterDec)* ;



functionBody : START  block  ( return )* END;
return : RETURN (expr | call)  SCO;
methodBlock : stat | this;
methodBody:  START  methodBlock*  ( return )* END;


switch_stat : SWITCH OP switch_key CP switchBody;
switch_key : ID | INT_NUM;
switchBody: START (CASE ( INT_NUM | STRING_singl )  CO block  (BREAK SCO)* )* ( DEFAULT CO block (BREAK SCO)*)? END ;


 // -------------------- <<  CLass

classDeclaration : ABSTRACT? CLASS type_ID typeParameters? superclass?  interfaces? START classBody END ;

propretes : (property)+;
property : decVar SCO ;
classMethods : ( method )+;
method : returnType funName parameterPart methodBody ;
constructor : ID parameterPart+ methodBody  ;
defConstructor :ID OP CP functionBody;
withConstructors:constructor? ( classMethods | property )* defConstructor? |defConstructor? ( classMethods | property )* constructor?;
superclass : EXTENDS typeNotVoid mixins? | mixins ;
interfaces : IMPLEMENTS typeNotVoidList ;
typeNotVoid : ID Q?  | ID COM ID ;
typeNotVoidList : typeNotVoid (  typeNotVoid )*;
mixins : WITH typeNotVoidList ;
metadata : ( AT metadatum )* ;
metadatum : identi | qualifiedName ;
typeParameter : metadata identi ( EXTENDS typeNotVoid )? ;
typeParameters : LT typeParameter ( COM typeParameter )* GT ;
qualifiedName : type_ID DOT identi | type_ID DOT type_ID DOT identi ;


//// Object

object : ID OP (objectParameters |STRING_singl) * CP ;
objectParameter: ID CO (CONST? object | ID | boolValue |number |call |anonymousFunction | STRING | STRING_singl);
objectParameters : objectParameter ( COM objectParameter)* COM?;

objectProperty:ID DOT ID;
objectMethod : ID DOT callFunction;
callObject : ID DOT object;
objectDeclaration : ID object;

classBody: ( classMethods | property )* withConstructors? ( classMethods | property )* ;


decVar
    : (CONST |FINAL? variableType ) ID (E (expr|boolValue))? #varableDeclaration ;


variableType
        :INT_TYPE
        |BOOL_TYPE
        |STRING_TYPE
        |FLOAT_TYPE
        |DOUBLE_TYPE
        |VAR
        ;

number : INT_NUM | FLOAT_NUM;
this :  THIS DOT call | THIS DOT ID;

expr
 : //expr POW<assoc=right> expr           #powExpr
  MIN expr                             #unaryMinusExpr
 | expr op = (MUL | DIV | MOD) expr      #multiplicationExpr
 | expr op=(P | MIN) expr              #additiveExpr
 | atom                                #atomExpr
 ;

atom
 :OP expr CP             #parExpr
 |INT_NUM                 #intNumber
 |FLOAT_NUM               #floatNumber
 | ID                     #idAtom
 | STRING                 #stringAtom
 |this                    #thisClsss
 ;

 comparison
 : expr LE  expr  #lessEqual
 | expr EGT expr #greaterEqual
 | expr LT expr  #lessOperation
 | expr GT expr  #greaterOperation
 | expr EE expr  #equalOperation
 | expr NE expr  #notEqual
 ;


 boolValue :  TRUE | FALSE ;

 logical:
        OP logical CP
        |logical  op = (AA | OR)  logical
        |comparison
        |BOOL_VALUE
        |NOT comparison
        |ID;

 assignment
  : (ID | this) E expr
  | (ID | this) MULE expr
  | (ID | this) PE expr
  | (ID | this) MODE expr
  | (ID | this) MIE expr
  | (ID | this) SLE expr
  |

  ;


//TYPE_ID
type_ID: ID| ASYNC | HIDE | OF | ON | SHOW | SYNC | AWAIT | YIELD | DYNAMIC | NATIVE | FUNCTION;


//IDENTI
identi
  : ID | ABSTRACT | AS | COVARIANT | DEFERRED | DYNAMIC | EXPORT | EXTERNAL| EXTENSION | FACTORY
  | FUNCTION | GET | IMPLEMENTS | IMPORT | INTERFACE | LATE
  | LIBRARY | MIXIN| OPERATOR | PART | REQUIRED | SET | STATIC | TYPEDEF | FUNCTION
  |ASYNC | HIDE | OF | ON | SHOW | SYNC | AWAIT | YIELD | DYNAMIC | NATIVE ;