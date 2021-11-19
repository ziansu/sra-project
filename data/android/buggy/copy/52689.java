public void registerStrat(org.openstreetmap.josm.plugins.continuosDownload.AbstractDownloadStrategy strat) {
    org.openstreetmap.josm.plugins.continuosDownload.DownloadPlugin.strats.put(strat.getClass().getSimpleName(), strat);
}