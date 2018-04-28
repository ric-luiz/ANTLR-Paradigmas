grammar ricardo;

program: PROGRAM ID BRACKETS_OPEN 
	sentece*
	BRACKETS_CLOSE;

sentece: var_decl | var_assign | println;

var_decl: VAR ID SEMICOLON;
var_assign: ID ASSIGN NUMBER SEMICOLON;
println: PRINTLN NUMBER SEMICOLON;

PROGRAM : 'program' ;
VAR: 'var';
PRINTLN: 'println';

PLUS: '+';
MENOS: '-';
MULT: '*';
DIV: '/';

AND: '&&';
OR: '||';
NOT : '!';

GT: '>';
LT: '<';
GTQ: '>=';
LTQ: '<=';
EQ: '==';
NEQ: '!=';

ASSIGN: '=';

BRACKETS_OPEN: '{';
BRACKETS_CLOSE: '}';

PAR_OPEN: '(';
PAR_CLOSE: ')';

SEMICOLON: ';';

ID: [a-zA-Z_][a-zA-Z0-9_]*;

NUMBER: [0-9];

WS: [ \t\r\n]+ -> skip ;