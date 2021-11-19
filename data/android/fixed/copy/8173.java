@java.lang.Override
public void removeParameter(java.lang.String name) {
    parameters.remove(name);
    fireContainerEvent("removeParameter", name);
}