public void traceStop() {
    if ((trace) != null) {
        cpu.trace(null);
        trace.write();
    }
}