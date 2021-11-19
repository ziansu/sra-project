public boolean contains(Syntax.SyntaxBuilder.Grammar grammar) {
    for (Syntax.SyntaxElement child : children) {
        if (grammar.equals(child.getGrammar()))
            return true;
        
    }
    return false;
}