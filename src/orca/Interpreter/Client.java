package orca.Interpreter;

import org.junit.jupiter.api.Test;

public class Client {
    @Test
    public void test(){

        BrowserContext context = new BrowserContext();

//        先用語法分析器，將詞句分類，選擇要用哪種解釋器解釋。

        /**
         * 做了各種分類
         */

//        兩種解釋器
        AbstractExpression nonterminal = new NonterminalExpression();
        AbstractExpression terminal = new TerminalExprssion();

        /**
         *不同的詞句要對應到對的解釋器
         */

//        終端的丟進終端解釋
        terminal.interpret(context);

//        非終端的丟進非終端解釋
        nonterminal.interpret(context);

    }
}
