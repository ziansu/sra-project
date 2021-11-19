boolean include(java.lang.String name, boolean isNode) {
    boolean include = true;
    for (opendap.threddsHandler.Filter.Clude clude : _cludes) {
        include &= clude.include(name, isNode);
    }
    return include;
}