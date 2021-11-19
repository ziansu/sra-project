@java.lang.Override
protected java.util.List<org.junit.runners.model.FrameworkMethod> getChildren() {
    final java.util.List<org.junit.runners.model.FrameworkMethod> children = super.getChildren();
    java.util.Collections.shuffle(children);
    return children;
}