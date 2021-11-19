private void update() {
    if (!(uptodate)) {
        summary.clear();
        distinctTraces.clear();
        traces.clear();
        addTraces(allTraces);
        uptodate = true;
    }
}