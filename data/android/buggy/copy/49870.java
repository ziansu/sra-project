@java.lang.Override
public void run() {
    org.jfree.chart.JFreeChart combined = _chartComposite.getChart();
    info.limpet.stackedcharts.ui.view.TimeBarPlot plot = ((info.limpet.stackedcharts.ui.view.TimeBarPlot) (combined.getPlot()));
    plot._showLine = isChecked();
    refreshPlot();
}