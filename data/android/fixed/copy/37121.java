public java.lang.String dump() throws edu.umass.cs.gnscommon.exceptions.client.ClientException, java.io.IOException {
    return gnsClient.execute(edu.umass.cs.gnsclient.client.GNSCommand.dump()).getResultString();
}