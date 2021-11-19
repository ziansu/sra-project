protected org.esa.snap.framework.dataop.barithm.UncertaintyPropagator createUncertaintyPropagator() {
    return new org.esa.snap.framework.dataop.barithm.GaussianUncertaintyPropagator(1, true);
}