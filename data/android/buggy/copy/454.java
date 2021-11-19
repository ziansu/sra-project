@java.lang.Override
public org.eclipse.titan.designer.AST.Identifier getComponentIdentifierByName(final org.eclipse.titan.designer.AST.Identifier identifier) {
    final org.eclipse.titan.designer.AST.TTCN3.types.CompField cf = getComponentByName(identifier.getName());
    return cf == null ? null : cf.getIdentifier();
}