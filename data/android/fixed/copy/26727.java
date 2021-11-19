@java.lang.Override
public com.puppycrawl.tools.checkstyle.api.DetailNode[] getChildren() {
    if ((children) == null) {
        return new com.puppycrawl.tools.checkstyle.api.DetailNode[0];
    }else {
        return java.util.Arrays.copyOf(children, children.length);
    }
}