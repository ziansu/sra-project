public void save(java.lang.Object object) throws org.openthinclient.ldap.DirectoryException {
    assertInitialized();
    if (org.openthinclient.common.directory.LDAPDirectory.isMutable(object.getClass())) {
        mapping.save(object, null);
        mapping.refresh(object);
    }
}