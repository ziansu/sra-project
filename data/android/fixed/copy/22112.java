public synchronized geogebra.cas.CASgeneric getCurrentCAS() {
    if ((cas) == null) {
        setCurrentCAS(Kernel.DEFAULT_CAS);
    }
    return cas;
}