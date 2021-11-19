private boolean isSink(java.lang.String objectType, java.lang.String objectMethod) {
    return this.sinks.contains(((objectType + ".") + objectMethod));
}