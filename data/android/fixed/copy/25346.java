private java.lang.String findIpByRole(java.lang.String cluster, java.lang.String service, java.lang.String role) throws java.lang.Exception {
    java.lang.String id = roleEjb.findRoles(cluster, service, role).get(0).getHostId();
    return findIpByHostId(id);
}