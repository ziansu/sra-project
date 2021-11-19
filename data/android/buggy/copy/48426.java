public void disconnect() {
    if (isConnected()) {
        diversicon.getSession().close();
        eu.kidf.diversicon.cli.DiverCli.LOG.info("");
        eu.kidf.diversicon.cli.DiverCli.LOG.info("Disconnected.");
        eu.kidf.diversicon.cli.DiverCli.LOG.info("");
    }
}