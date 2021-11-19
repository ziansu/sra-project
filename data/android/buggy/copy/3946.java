@java.lang.Override
protected void drawCharts() {
    if ((magChart) == null) {
        set = false;
        return ;
    }
    plotSelection.setSelectedIndex(0);
    chart = magChart;
    chartPanel.setChart(chart);
    chartPanel.setMouseZoomable(true);
}