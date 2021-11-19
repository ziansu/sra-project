public java.lang.String dump() throws edu.umass.cs.gnscommon.exceptions.client.ClientException, java.io.IOException {
    try {
        accountGuidCreate("Admin", edu.umass.cs.gnsserver.main.GNSConfig.getInternalOpSecret());
    } catch (edu.umass.cs.gnscommon.exceptions.client.DuplicateNameException dne) {
    }
    return gnsClient.execute(edu.umass.cs.gnsclient.client.GNSCommand.dump()).getResultString();
}