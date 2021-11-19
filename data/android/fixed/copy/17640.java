@java.lang.Override
public java.lang.Object visit(net.sourceforge.pmd.lang.java.ast.ASTClassOrInterfaceType node, java.lang.Object data) {
    checkImports(node, data);
    return data;
}