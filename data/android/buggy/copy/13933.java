public com.worldcretornica.plotme_core.api.Location getPlotHome(com.worldcretornica.plotme_core.PlotId id, com.worldcretornica.plotme_core.api.IWorld world) {
    com.worldcretornica.plotme_core.api.Location plotHome = getGenManager(world).getPlotHome(id);
    plugin.getLogger().info(plotHome.toString());
    return plotHome;
}