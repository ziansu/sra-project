public java.util.List<com.shopify.graphql.support.Node> getNodes() {
    final java.util.ArrayList<com.shopify.graphql.support.Node> children = new java.util.ArrayList<>();
    com.shopify.graphql.support.AbstractResponse.collectNodes(this, children);
    return children;
}