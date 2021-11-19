public void setInputConfig(final org.deidentifier.arx.gui.model.ModelConfiguration config) {
    this.inputConfig = config;
    this.metricConfig = config.getMetric().getConfiguration();
    this.metricDescription = config.getMetric().getDescription();
}