@java.lang.Override
protected boolean accepts(java.lang.String name) {
    return (name != null) && (regex.test(name));
}