public void addResource(java.lang.String thing) {
    resources.put(thing, getResource(com.google.common.io.Resources.getResource(thing)));
}