public static org.eclipse.ecf.mgmt.identity.IDMTO createIDMTO(org.eclipse.ecf.core.identity.ID id) {
    return new org.eclipse.ecf.mgmt.identity.IDMTO(org.eclipse.ecf.mgmt.identity.host.IdentityFactoryManager.createNamespaceMTO(id.getNamespace()), id.getName(), id.toExternalForm());
}