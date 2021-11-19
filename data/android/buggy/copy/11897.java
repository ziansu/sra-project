public void createInternalNetworkForNeutron(org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.topology.Node node) {
    getSystemProperties(node);
    org.opendaylight.vtn.manager.neutron.impl.OVSDBEventHandler.LOG.trace("createInternalNetworkForNeutron() - node ={}, integration bridge ={}", node.toString());
}