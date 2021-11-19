public static void fillDisplayModelFromInputStream(final java.io.InputStream inputStream, final org.csstudio.opibuilder.model.DisplayModel displayModel) throws java.lang.Exception {
    java.util.Map<org.jdom.Element, org.csstudio.opibuilder.model.ConnectionModel> connections = new java.util.HashMap<>();
    org.csstudio.opibuilder.persistence.XMLUtil.fillDisplayModelFromInputStream(inputStream, displayModel, connections, null);
    addConnections(connections);
}