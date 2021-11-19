public java.lang.String createLineChart() {
    getData();
    chart = org.jfree.chart.ChartFactory.createLineChart("test", xAxis, yAxis, dataset, PlotOrientation.VERTICAL, true, true, false);
    return saveChart();
}