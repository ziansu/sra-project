@java.lang.Override
public java.lang.Object visit(bantam.visitor.Class_ node) {
    this.setCurrentClassName(node.getName());
    java.lang.System.out.println(this.getCurrentMethodSymbolTable());
    super.visit(node);
    return null;
}