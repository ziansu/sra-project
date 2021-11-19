public com.orientechnologies.orient.server.OServerUserConfiguration serverLogin(final java.lang.String iUser, final java.lang.String iPassword, final java.lang.String iResource) {
    if (!(authenticate(iUser, iPassword, iResource)))
        throw new com.orientechnologies.orient.core.exception.OSecurityAccessException("Wrong user/password to [connect] to the remote OrientDB Server instance. Get the user/password from the config/orientdb-server-config.xml file");
    
    return getUser(iUser);
}