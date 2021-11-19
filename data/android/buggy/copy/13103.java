private void processIfSimpleConditions(java.util.List<com.mycompany.complexity.tool.mvn.Nodes.IfNode> conditions) {
    for (com.mycompany.complexity.tool.mvn.Nodes.IfNode node : conditions) {
        instanciateIfNode(node.getBaseStatement(), node.getCondition(), node.getId());
    }
}