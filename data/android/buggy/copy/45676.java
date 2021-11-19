@java.lang.Override
public void traceChange(de.prob.statespace.Trace currentTrace, boolean currentAnimationChanged) {
    this.currentTrace = currentTrace;
    if ((currentTrace != null) && (currentTrace.getStateSpace().equals(currentStateSpace))) {
        sendRefresh();
    }
}