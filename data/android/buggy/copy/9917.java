private void setPactorInCollisionBucket(java.lang.String pactorName) {
    Engine.TileCoordinate tc = getPositionFor(pactorName);
    createCollisionBucketForTileCoordinateIfBucketAbsent(tc);
    int id = tc.hashCode();
    sharedPactorLocationBuckets.get(id).add(pactorName);
}