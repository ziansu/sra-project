private boolean hasAnyError(com.redhat.ceylon.compiler.typechecker.tree.Node that) {
    for (com.redhat.ceylon.compiler.typechecker.tree.Message message : that.getErrors())
        if (!(message instanceof com.redhat.ceylon.compiler.typechecker.analyzer.AnalysisWarning))
            return true;
        
    
    return false;
}