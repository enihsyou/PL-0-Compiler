grammar Pl0;


DOT:                '.';    // 程序结束的标记
COMMA:              ',';    // 分割标识符的定义
SEMICOLON:          ';';    // 语句结束的标记
ASSIGN_OP:          ':=';   // 变量赋值
LESS_THAN:          '<';    // 测试左边表达式的值小于右边的
LESS_EQUAL:         '<=';   // 测试左边表达式的值小于等于右边的
GREATER_THAN:       '>';    // 测试左边表达式的值大于右边的
GREATER_EQUAL:      '>=';   // 测试左边表达式的值大于等于右边的
EQUALS:             '=';    // 测试左边表达式的值等于右边的；常量定义
DIAMOND:            '#';    // 测试左边表达式的值不等于右边的
PLUS:               '+';    // 表达式中的加法
MINUS:              '-';    // 表达式中的减法
TIMES:              '*';    // 表达式中的乘法
OVER:               '/';    // 表达式中的除法
LPAREN:             '(';    // 表达式因子开始的标记
RPAREN:             ')';    // 表达式因子结束的标记

CONST:              'const';
INT_DECLARATION:    'var' | 'int';
ODD:                'odd';  // 判断一个表达式是不是偶数
BEGIN:              'begin';// 开始一块语句
END:                'end';  // 结束一块语句
IF:                 'if';   // 开始一个判断语句
THEN:               'then';
ELSE:               'else';
WHILE:              'while';
DO:                 'do';
CALL:               'call';
PROCEDURE:          'procedure';
IN:                 'read';  // 要求用户输入
OUT:                'write'; // 输出表达式结果

WS:                 [ \t\r\n\f]+ -> channel(HIDDEN);

// 标识符
IDENTIFER: Letter (Letter|INTEGER)* ;

// 整数
INTEGER: Digit+ ;


fragment Letter: [a-zA-Z_] ;

fragment Digit: [0-9] ;


// 主程序
program : block DOT ;

// 程序块
// 具有常量定义、变量定义、过程定义和语句
block : const_declaration? var_declaration? procedure_declaration* statement+ ;

const_declaration : CONST const_assigment (COMMA const_assigment)* SEMICOLON ;

var_declaration : INT_DECLARATION IDENTIFER (COMMA IDENTIFER)* SEMICOLON ;

procedure_declaration : PROCEDURE IDENTIFER SEMICOLON block SEMICOLON ;

const_assigment : IDENTIFER EQUALS INTEGER ;

// 语句
statement
    : IDENTIFER ASSIGN_OP expression
    | CALL IDENTIFER
    | BEGIN statement (SEMICOLON statement)* END
    | IF condition THEN statement (ELSE statement)?
    | WHILE condition DO statement
    | IN IDENTIFER (COMMA IDENTIFER)*
    | OUT expression (COMMA expression)*
    ;

// 条件判断
condition
    : expression relation_op expression
    | ODD expression
    ;

// 关系运算符
relation_op: (EQUALS | DIAMOND | LESS_THAN |  LESS_EQUAL | GREATER_THAN | GREATER_EQUAL);

// 表达式
expression : (PLUS | MINUS)? term ((PLUS | MINUS) term)* ;

// 表达式的项
term: factor ((TIMES | OVER) factor)* ;

// 表达式的因子
factor
    : IDENTIFER
    | INTEGER
    | LPAREN expression RPAREN
    ;
