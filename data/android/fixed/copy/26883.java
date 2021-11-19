@java.lang.SuppressWarnings(value = "rawtypes")
public java.util.List<org.eclipse.emf.emfstore.internal.server.model.accesscontrol.ACOrgUnit> getMembers(org.eclipse.emf.emfstore.internal.server.model.SessionId sessionId, org.eclipse.emf.emfstore.internal.server.model.accesscontrol.ACOrgUnitId groupId) throws org.eclipse.emf.emfstore.server.exceptions.ESException {
    getConnectionProxy(sessionId);
    return adminEmfStore.getMembers(sessionId, groupId);
}