public Syntax.SyntaxElement ancestor(Syntax.SyntaxBuilder.Grammar grammar) {
    if (getGrammar().equals(grammar.name()))
        return this;
    
    if ((parent) == null)
        return null;
    
    return parent.ancestor(grammar);
}