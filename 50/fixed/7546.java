@java.lang.Override
public java.util.Set<org.talend.components.api.component.ConnectorTopology> getSupportedConnectorTopologies() {
    return java.util.EnumSet.of(ConnectorTopology.NONE, ConnectorTopology.INCOMING, ConnectorTopology.OUTGOING, ConnectorTopology.INCOMING_AND_OUTGOING);
}