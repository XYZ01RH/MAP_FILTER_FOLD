lexer grammar A2Lexer;

fragment ESCAPED_QUOTE : '\\"';
STRING 	:   '"' ( ESCAPED_QUOTE | ~('\n'|'\r') )*? '"';
A2 	: '#' -> mode(A2_MODE);
JTXT 	: ~('#'|'"')+ ;


mode A2_MODE;
OUTLIST : 'MAP' | 'FILTER';
OUTVAL	: 'FOLD';
ID 		: ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9')*;
COMMA 	: ',';
EQ 		: '=';
WS 		: (' ' | '\t'|'\r'| '\n') {skip();};
BRSTART : '[';
CSTART 	: '{' -> mode(DJAVA_MODE) ;

mode DJAVA_MODE;
JALL 	: .*? '}]'  (' '|'\t')*  '\r'?'\n'  -> mode(DEFAULT_MODE);