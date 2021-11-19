public void visitDataDecl(AppleCoreCompiler.Semantics.DataDecl node) throws AppleCoreCompiler.Semantics.SemanticError {
    if ((node.label) != null) {
        printStatus("Adding symbol for ", node);
        addMapping(node.label, node, map);
    }
}