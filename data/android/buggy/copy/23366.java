protected void setRootModule(java.lang.String namespaceURI, org.exist.xquery.Module module) {
    allModules.put(namespaceURI, module);
    parentContext.setRootModule(namespaceURI, module);
}