public boolean hasTunables(final java.lang.Object o, java.lang.String context) {
    java.util.List<org.cytoscape.work.swing.GUITunableHandler> handlers = getApplicableHandlers(o, context);
    return (handlers.size()) > 0;
}