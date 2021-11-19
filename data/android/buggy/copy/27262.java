@com.google.appinventor.components.annotations.DesignerProperty(editorType = com.google.appinventor.components.common.PropertyTypeConstants.PROPERTY_TYPE_BOOLEAN, defaultValue = com.google.appinventor.components.runtime.Chart.DEFAULT_ENABLED ? "True" : "False")
@com.google.appinventor.components.annotations.SimpleProperty(description = "Sets visibility of Chart. True will show the chart, " + "False will hide it.")
public void ShowLegend(boolean showLegend) {
    this.showLegend = showLegend;
    com.github.mikephil.charting.components.Legend chartLegend = lineChart.getLegend();
    chartLegend.setEnabled(showLegend);
    lineChart.invalidate();
}