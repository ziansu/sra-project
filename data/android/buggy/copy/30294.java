org.opendaylight.yangtools.yang.data.api.schema.ContainerNode effectiveAttributes(final org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.bgp.rib.rev130925.PeerId sourcePeerId, final org.opendaylight.yangtools.yang.data.api.schema.ContainerNode attributes) {
    return policy.effectiveAttributes(peerRoles.get(sourcePeerId), attributes);
}