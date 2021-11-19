private java.lang.Double calculateSpeed(final java.lang.Double distance, final long elapsed) {
    return (distance / elapsed) * (ws.sosna.pinetrail.model.PointsAugmenter.MS2KMH);
}