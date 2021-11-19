public void addPoints(java.lang.Long[] deltas) {
    if (deltas != null) {
        for (long delta : deltas) {
            addPoint(delta);
        }
    }
}