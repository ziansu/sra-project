public static org.csstudio.opibuilder.model.AbstractWidgetModel XMLElementToWidget(org.jdom.Element element) throws java.lang.Exception {
    java.util.Map<org.jdom.Element, org.csstudio.opibuilder.model.ConnectionModel> connections = new java.util.HashMap<>();
    org.csstudio.opibuilder.model.AbstractWidgetModel model = org.csstudio.opibuilder.persistence.XMLUtil.XMLElementToWidget(element, null, connections);
    addConnections(connections);
    return model;
}