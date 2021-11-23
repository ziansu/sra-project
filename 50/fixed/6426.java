@java.lang.Override
public void setIndependentSeries(org.eclipse.ice.viz.service.ISeries series) {
    super.setIndependentSeries(series);
    getSource().setIndependentSeries(series);
    independentProxy = createProxySeries(series);
    loaded = false;
    getSource().redraw();
}