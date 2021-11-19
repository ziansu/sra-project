public javafx.collections.ObservableList<javafx.scene.chart.XYChart.Series<java.lang.String, java.lang.Number>> getObservableDiagrammList(java.lang.String query) {
    if (query.equals("saulendiagramm")) {
        refreshViews();
        return statistics.Diagramm.getChartData();
    }else {
        return null;
    }
}