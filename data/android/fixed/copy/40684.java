private java.lang.Double calculateSpeed(final java.lang.Double distance, final long elapsed) {
    return elapsed > 0 ? (distance / elapsed) * (ws.sosna.pinetrail.model.PointsAugmenter.MS2KMH) : 0;
}