@java.lang.Override
public void afterProcess() {
    if ((players) != null) {
        logger.logMessage("processstartdone", players.size());
    }
}