@java.lang.Override
public void traverse() {
    stopCriterion.resetTimer();
    org.deidentifier.arx.framework.lattice.Node bottom = lattice.getBottom();
    assureChecked(bottom);
    if (!(stopCriterion.isFulfilled())) {
        traverse(bottom);
    }
}