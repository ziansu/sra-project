private void removePactorFromCollisionBucket(java.lang.String pactorName) {
    Engine.TileCoordinate tc = getPositionFor(pactorName);
    createCollisionBucketForTileCoordinateIfBucketAbsent(tc);
    int id = tc.hashCode();
    sharedPactorLocationBuckets.get(id).remove(pactorName);
}