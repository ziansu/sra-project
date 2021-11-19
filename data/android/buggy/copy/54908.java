@java.lang.Override
public int getLineNumber(org.antlr.netbeans.editor.parsing.SyntaxError t) {
    return t.getLocation().getStart().getContainingLine().getLineNumber();
}