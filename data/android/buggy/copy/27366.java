public void traverse(graphql.language.Node root, graphql.validation.QueryLanguageVisitor queryLanguageVisitor) {
    java.util.List<graphql.language.Node> path = new java.util.ArrayList<graphql.language.Node>();
    traverseImpl(root, queryLanguageVisitor, path);
}