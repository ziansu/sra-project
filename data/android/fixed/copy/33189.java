public java.lang.String createLineChart() {
    getData();
    chart = org.jfree.chart.ChartFactory.createLineChart(title, xAxis, yAxis, dataset, PlotOrientation.VERTICAL, true, true, false);
    return saveChart();
}