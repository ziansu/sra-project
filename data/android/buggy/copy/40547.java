private ConcreteTree.StoDecl stoDecl() throws parser.GrammarErrorException {
    java.lang.System.out.println("storeDecl ::= optChangeMode typedIdent");
    parser.ConcreteTree.StoDecl ret = null;
    parser.ConcreteTree.IOptCHANGEMODE optCHANGEMODE = optCHANGEMODE();
    parser.ConcreteTree.ITypeIdent typeIdent = typeIdent();
    return new parser.ConcreteTree().StoDecl(optCHANGEMODE, typeIdent);
}