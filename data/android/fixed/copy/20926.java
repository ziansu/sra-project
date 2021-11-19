public void removeNamespace(java.net.URI namespaceURI) {
    if (isRequiredNamespaceBinding(namespaceURI)) {
        throw new java.lang.IllegalStateException(("Cannot remove required namespace " + (namespaceURI.toString())));
    }
    nameSpaces.remove(namespaceURI.toString());
}