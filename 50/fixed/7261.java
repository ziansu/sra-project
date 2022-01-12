public boolean checkWritePermission(java.lang.String user) {
    return user.equals(org.opends.server.snmp.SNMPUserAcl.ADMIN_USER);
}