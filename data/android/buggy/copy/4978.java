public void loadPropagator() {
    de.ovgu.featureide.fm.core.job.LongRunningWrapper.runMethod(this.propagator.load());
    update(false, null);
}