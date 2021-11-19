public java.lang.String getDatasetsJson() {
    try {
        return de.jwic.controls.chart.impl.util.DataConverter.convertToJson(datasets);
    } catch (java.lang.Exception e) {
        de.jwic.controls.chart.api.ChartModel.LOG.error(e.getMessage());
    }
    return "{}";
}