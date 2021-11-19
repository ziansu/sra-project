public ch.ethz.mbench.server.Response createSchema(int nCols, ch.ethz.mbench.server.MbServer.Connection mConnection) {
    mConnection.createSchema(nCols);
    ch.ethz.mbench.server.Response resp = new ch.ethz.mbench.server.Response(new java.lang.Object[]{ true , "" });
    resp.setConnection(mConnection);
    return resp;
}