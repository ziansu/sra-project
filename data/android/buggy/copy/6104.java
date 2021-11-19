public act.util.ClassNode visitSubTree($.Function<act.util.ClassNode, ?> visitor) {
    for (act.util.ClassNode child : children) {
        child.visitTree(visitor);
    }
    return this;
}