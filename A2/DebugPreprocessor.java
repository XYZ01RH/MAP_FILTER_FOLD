import org.antlr.v4.runtime.*;

 
public class DebugPreprocessor {
    public static void main(String[] args) throws Exception {
        ANTLRInputStream input = new ANTLRInputStream(System.in);
        A2Lexer lexer = new A2Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        A2Parser parser = new A2Parser(tokens);
        parser.prog();
    }
}
