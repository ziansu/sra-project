@java.lang.Override
public boolean isRunning() throws net.bpiwowar.xpm.exceptions.ConnectorException {
    if ((pid) == null) {
        return super.isRunning();
    }
    net.bpiwowar.xpm.connectors.OARStat oarStat = new net.bpiwowar.xpm.connectors.OARStat(getConnector(), pid, true);
    return oarStat.isRunning();
}