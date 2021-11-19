private boolean isSink(java.lang.String objectType, java.lang.String objectMethod) {
    return isSink(((objectType + ".") + objectMethod));
}