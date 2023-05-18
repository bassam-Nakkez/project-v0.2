lexer grammar DartLexer;

// ---------------------------------------- Lexer rules.


INT_TYPE : 'INT'|'int';
STRING_TYPE : 'String'|'string';
BOOL_TYPE : 'BOOL'|'bool';
FLOAT_TYPE : 'float'|'FLOAT';
DOUBLE_TYPE : 'DOUBLE'|'double';
LABELTEXT:'labelText:';
INPUTDECORATION:'InputDecoration';
CONTROLLER:'controller:';

BUILDER : 'builder';
MATERIALPAGEROUTE : 'MaterialPageRoute';
PUSH : 'push';
CONTEXT : 'context';
NAVIGATOR : 'Navigator';
TextFiled :'TextFiled';
Container : 'Container(';
Child: 'child:';
Width : 'width:';
Height: 'height:' ;
Colors :'Colors.';
PADDING:'padding:';
MARGIN:'margin:';
EdgeInsets:'EdgeInsets';
EdgeInsets_symmetric:'EdgeInsets.symmetric(';
EdgeInsets_all:'EdgeInsets.all(';
Bottom:'bottom:';
LEFT:'left:';
RIGHT:'right:';
TOP:'top:';
COLOR:'color(';

Horizontal:'horizontal:';
Vertical:'vertical:';
AlignmentNamePro:'alignment:';
Alignment:'Alignment.';
Center:'center';
Start:'start';
End:'end';
SpaceBetween:'spaceBetween';
SpaceAround:'spaceAround';
SpaceEvenly:'spaceEvenly';
ColorFromHSV:'Color.fromHSV(';


// Colors

ColorName:'color:';




// TEXT WIDGET

TEXT:'Text(';
Style:'style:';
TextStyle:'TextStyle(';
StrutStyle:'StrutStyle(';
TextAlign:'TextAlign(';
Justify:'justify';
MaxLines: 'maxLines:';
TextDirection:'TextDirection(';
LRL:'ltr' |
    'rtl' |
    'ltt' |
    'rtt' ;
Locale:'Locale(';
AspectRatio:'aspectRatio:';
FontFamily:'fontFamily:';
FontSize:'fontSize:';
SizedBox: 'SizedBox(';
SizeName:'size:';
Size:'Size';




// COlumn and ROW

CrossAxisSpacing:'crossAxisSpacing:';
MainAxisSpacing: 'mainAxisSpacing:';
Stretch:'stretch';
CrossAxisAlignment:'crossAxisAlignment:';
CrossAxisAlignmentDOT:'CrossAxisAlignment.';
MainAxisAlignment:'mainAxisAlignment:';
MainAxisAlignmentDOT:'MainAxisAlignment.';
VerticalDirection:'verticalDirection:';
Column : 'Column';
ROW : 'Row';
DOWN:'down';
UP:'up';
Children:'children:';


/// SingleChildScrollView
SingleChildScrollView:'SingleChildScrollView';
ScrollDirection : 'scrollDirection:';

// Padding

Padding:'Padding';
ALL:'all';
Symmetric:'symmetric';
HorizontalName : 'horizontal';
VerticalName:  'vertical';




// Scaffold
Scaffold: 'Scaffold';
Body : 'body:';
AppBar:'appBar:';
AppBarPara:'AppBar(';
Title:'title:';
FloatingActionButton:'FloatingActionButton';
CenterWidget:'Center';
FloatingActionButtonProp:'floatingActionButton:';

OnPressed:'onPressed:';
MaterialApp:'MaterialApp(';
Home:'home:';


/// Image widget
Image: 'Image';
ImageProp:'image:';
AssetImage:'AssetImage(';
NetworkImage:'NetworkImage(';
FileImage:'FileImage(';
File:'File';


CP: ')';
DOT: '.';
E: '=';
EE: '==';
EGT: '>=';
GT: '>';
LE: '<=';
LL: '<<';
LLE: '<<=';
LT: '<';
MIN: '-';
MINMIN: '--';
MOD: '%';
MODE: '%=';
MUL: '*';
MULE: '*=';
NE: '!=';
OB: '[';
OP: '(';
P: '+';
PE: '+=';
POUND: '#';
PP: '++';
Q: '?';
QD: '?.';
QDD: '?..';
QQ: '??';
MIE: '-=';
SCO: ';';
DIV: '/';
SLE: '/=';
TE: '^=';
POW :'^';
COT: '"';
START :'{';
END:'}';
AA: '&&';
AND: '&';
ANDE: '&=';
AT: '@';
B: '|';
NOT: '!';
OR : '||';
BE: '|=';
CB: ']';
CO: ':';
COM: ',';
ARROW:'=>';

fragment
LETTER
    :    'a' .. 'z'
    |    'A' .. 'Z'
    ;

fragment
DIGIT
    :    '0' .. '9'
    ;

fragment
EXPONENT
    :    ('e' | 'E') ('+' | '-')? DIGIT+
    ;


// Reserved words.

ASSERT
    :    'assert'
    ;

BREAK
    :    'break'
    ;

CASE
    :    'case'
    ;

CATCH
    :    'catch'
    ;

CLASS
    :    'class'
    ;

CONST
    :    'const'
    ;

CONTINUE
    :    'continue'
    ;

DEFAULT
    :    'default'
    ;

DO
    :    'do'
    ;

ELSE
    :    'else'
    ;

ENUM
    :    'enum'
    ;

EXTENDS
    :    'extends'
    ;

FALSE
    :    'false'|'FALSE'
    ;

FINAL
    :    'final'
    ;

FINALLY
    :    'finally'
    ;

FOR
    :    'for'|'FOR'
    ;

IF
    :    'if'|'IF'
    ;

IN
    :    'in'
    ;

IS
    :    'is'
    ;

NEW
    :    'new'
    ;

NULL
    :    'null'
    ;

RETHROW
    :    'rethrow'
    ;

RETURN
    :    'return' | 'RETURN'
    ;

SUPER
    :    'super'
    ;

SWITCH
    :    'switch'|'SWICH'
    ;

THIS
    :    'this'
    ;

THROW
    :    'throw'
    ;

TRUE
    :    'true'|'TRUE'
    ;

TRY
    :    'try'
    ;

VAR
    :    'var'
    ;

VOID
    :    'void'
    ;

WHILE
    :    'while'
    ;

WITH
    :    'with'
    ;

// Built-in identifiers.

ABSTRACT
    :    'abstract'
    ;

AS
    :    'as'
    ;

COVARIANT
    :    'covariant'
    ;

DEFERRED
    :    'deferred'
    ;

DYNAMIC
    :    'dynamic'
    ;

EXPORT
    :    'export'
    ;

EXTENSION
    :    'extension'
    ;

EXTERNAL
    :    'external'
    ;

FACTORY
    :    'factory'
    ;

FUNCTION
    :    'Function'
    ;

GET
    :    'get'
    ;

IMPLEMENTS
    :    'implements'
    ;

IMPORT
    :    'import'
    ;

INTERFACE
    :    'interface'
    ;

LATE
    :    'late'
    ;

LIBRARY
    :    'library'
    ;

OPERATOR
    :    'operator'
    ;

MIXIN
    :    'mixin'
    ;

PART
    :    'part'
    ;

REQUIRED
    :    'required'
    ;

SET
    :    'set'
    ;

STATIC
    :    'static'
    ;

TYPEDEF
    :    'typedef'
    ;

// "Contextual keywords".

AWAIT
    :    'await'
    ;

YIELD
    :    'yield'
    ;

// Other words used in the grammar.

ASYNC
    :    'async'
    ;

HIDE
    :    'hide'
    ;

OF
    :    'of'
    ;

ON
    :    'on'
    ;

SHOW
    :    'show'
    ;

SYNC
    :    'sync'
    ;

NATIVE:'native';
OVERRIDE:  '@override';



// --------  ((  Widget )) --------------


BOOL_VALUE : TRUE | FALSE;
INT_NUM: '0'|'-'?[1-9][0-9]*;

FLOAT_NUM
 : '-'?[0-9]+ '.' [0-9]*
 | '.' [0-9]+
 ;

DOUBLE_NUM: '-'?[0-9]+ '.' [0-9]*
            | '.' [0-9]+
            ;

HEXDIGIT : [0-9A-Fa-f];
BOOLE_TYPE : TRUE | FALSE ;
STRING
 : '"' (~["\r\n] | '""')* '"'
 ;
 STRING_singl
  : '\'' (~['\r\n]  )* '\''
  ;


 ID
  : [A-Za-z_$][A-Za-z_$0-9]*
  ;


COMMENT
 : '//' ~[\r\n]* -> skip
 ;
MULTI_LINE_COMMENT : '/*' ( MULTI_LINE_COMMENT | . )*? '*/'  -> skip ;
WS
    :    (' ' | '\t' | '\r' | '\n')+ -> skip
    ;
