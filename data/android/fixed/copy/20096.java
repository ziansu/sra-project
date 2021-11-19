public static void addPlot(java.lang.String owner, int plotX, int plotZ) {
    org.nationsatwar.playground.plots.PlotObject newPlot = new org.nationsatwar.playground.plots.PlotObject(owner, plotX, plotZ);
    org.nationsatwar.playground.plots.PlotManager.plots.add(newPlot);
    org.nationsatwar.playground.database.DatabaseHandler.addtoDatabase(newPlot);
}