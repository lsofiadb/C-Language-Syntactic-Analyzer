package SoloLexico;
import static SoloLexico.Tokens.*;
%%
%class Lexico
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ \t \r]+
%{
    public String lexemas;
%}
%%

//------------------------------------------------------------------------------
//------------------------------------------------------------------------------
//operadores aritmeticos
/* Operador Igual */
( "=" ) {lexemas=yytext(); return Igual;}

/* Operador Suma */
( "+" ) {lexemas=yytext(); return Suma;}

/* Operador Resta */
( "-" ) {lexemas=yytext(); return Resta;}

/* Operador Multiplicacion */
( "*" ) {lexemas=yytext(); return Multiplicacion;}

/* Operador Division */
( "/" ) {lexemas=yytext(); return Division;}

//------------------------------------------------------------------------------
//------------------------------------------------------------------------------
/* Operadores Atribucion */
( "+=" | "-="  | "*=" | "/=" | "%=" ) {lexemas = yytext(); return Op_atribucion;}

/* Operadores Incremento y decremento */
( "++" | "--" ) {lexemas = yytext(); return Op_incremento;}

//------------------------------------------------------------------------------
//Operadores logicos------------------------------------------------------------
/* Operadores logicos */
( "&&" | "||" | "!" | "&" | "|" ) {lexemas=yytext(); return Op_logico;}

/*Operadores Booleanos*/
( true | false ) {lexemas=yytext(); return Op_booleano;}

//------------------------------------------------------------------------------
/*Operadores Relacionales */
( ">" | "<" | "==" | "!=" | ">=" | "<=" | "<<" | ">>" ) {lexemas = yytext(); return Op_relacional;}

//------------------------------------------------------------------------------
//Caracteres y simbolos---------------------------------------------------------
/* Punto */
( "." ) {lexemas=yytext(); return Punto;}

/* Coma */
( "," ) {lexemas=yytext(); return Coma;}

/* Parentesis de apertura */
( "(" ) {lexemas=yytext(); return Parent_a;}

/* Parentesis de cierre */
( ")" ) {lexemas=yytext(); return Parent_c;}

/* Llave de apertura */
( "{" ) {lexemas=yytext(); return Llave_a;}

/* Llave de cierre */
( "}" ) {lexemas=yytext(); return Llave_c;}

/* Corchete de apertura */
( "[" ) {lexemas=yytext(); return Corchete_a;}

/* Corchete de cierre */
( "]" ) {lexemas=yytext(); return Corchete_c;}

/* P_Coma */
( ";" ) {lexemas=yytext(); return P_Coma;}

//------------------------------------------------------------------------------
//-------------------------Palabras reservadas----------------------------------
/* Palabra reservada While */
( while ) {lexemas=yytext(); return While;}

/* Palabra reservada Do */
( do ) {lexemas=yytext(); return Do;}

/* Palabra reservada For */
( for ) {lexemas=yytext(); return For;}

//------------------------------------------------------------------------------
//Comparativos
/* Palabra reservada If */
( if ) {lexemas=yytext(); return If;}

/* Palabra reservada Else */
( else ) {lexemas=yytext(); return Else;}

/* Switch */
( "switch" ) {lexemas=yytext(); return Switch;}

/* Case */
( "case" ) {lexemas=yytext(); return Case;}

//------------------------------------------------------------------------------
//------------------------------------------------------------------------------
//Tipo de datos
/* Integer */
(int) {lexemas=yytext(); return Int;}

/* Double */
(double) {lexemas=yytext(); return Doble;}

/* Tipo de dato String */
( String ) {lexemas=yytext(); return Cadena;}

/* Tipos de datos */
( byte | int | char | long | float | double ) {lexemas=yytext(); return T_dato;}

//------------------------------------------------------------------------------

/* Espacios en blanco */
{espacio} {/*Ignore*/}

/* Comentarios */
( "//"(.)* ) {/*Ignore*/}

/* Salto de linea */
( "\n" ) {return Linea;}

/* Comillas */
( "\"" ) {lexemas=yytext(); return Comillas;}


//------------------------------------------------------------------------------
//Palabras reservadas
( break | continue | default | enum | extern | goto | register | return | union) {lexemas=yytext(); return Palabra_Reservada;}

/* Marcador de inicio de algoritmo */
( "main" ) {lexemas=yytext(); return Main;}

//------------------------------------------------------------------------------
//Funciones
/* Printf */
( printf ) {lexemas=yytext(); return Printf;}
/* Scanf */
( scanf ) {lexemas=yytext(); return Scanf;}
/* Cin */
( cin ) {lexemas=yytext(); return Cin;}
/* Cout */
( cout ) {lexemas=yytext(); return Cout;}

//------------------------------------------------------------------------------
/* Const*/
( const ) {lexemas=yytext(); return Const;}

/* Short */
( short ) {lexemas=yytext(); return Short;}

/* Unsigned */
( unsigned ) {lexemas=yytext(); return Unsigned;}

/* struct */
( struct ) {lexemas=yytext(); return Struct;}

/* Typedef */
( typedef ) {lexemas=yytext(); return Typedef;}

//------------------------------------------------------------------------------

/* Identificador */
{L}({L}|{D})* {lexemas=yytext(); return Identificador;}

/* Numero */
("(-"{D}+")")|{D}+ {lexemas=yytext(); return Numero;}

/* Error de analisis */
 . {return ERROR;}

