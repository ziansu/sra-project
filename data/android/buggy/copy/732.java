public heronarts.lx.Tempo setPeriod(double beatMillis) {
    this.manualPeriodUpdate = true;
    this.period.setValue(beatMillis);
    this.bpm.setValue(((heronarts.lx.Tempo.MS_PER_MINUTE) / beatMillis));
    return this;
}