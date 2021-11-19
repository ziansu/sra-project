private void createLineChart() {
    lineChart = ((com.github.mikephil.charting.charts.LineChart) (findViewById(R.id.lineChart)));
    lineChart.setData(LineChartData.graphData);
    lineChart.setVisibility(View.INVISIBLE);
    lineChart.setVisibleXRangeMaximum(10);
}