protected void onLocalVariableDeclarationLeave(edu.kit.ipd.pp.minijavac.transformation.LocalVariableDeclarationStatementNode node) {
    firm.nodes.Node initValue;
    if ((node.expression) != null) {
        java.lang.System.out.println(node.expression);
        initValue = node.expression.firmNode;
        construction.setVariable(((parameterCount) + (node.firmVarNumber)), initValue);
    }
}