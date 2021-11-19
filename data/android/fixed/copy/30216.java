private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    out.defaultWriteObject();
    out.writeObject(namespace.getPrefix());
    out.writeObject(namespace.getURI());
}