@java.lang.Override
public void visit(final com.redhat.ceylon.compiler.typechecker.tree.Tree.ClassDefinition that) {
    if ((opts.isOptimize()) && (that.getDeclarationModel().isClassOrInterfaceMember()))
        return ;
    
    com.redhat.ceylon.compiler.js.ClassGenerator.classDefinition(that, this, null);
}