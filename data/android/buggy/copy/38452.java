public boolean hasPermission(java.lang.String node) {
    node = node.toLowerCase();
    boolean allowed = hasPermission(node, getMappedPermissions());
    return allowed;
}