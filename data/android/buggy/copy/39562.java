public void resetPlot() {
    X_axies = 0;
    graph.removeAllSeries();
    series0.resetData(new com.jjoe64.graphview.series.DataPoint[]{  });
    graph.addSeries(series0);
}