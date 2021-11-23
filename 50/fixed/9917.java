private void setPactorInCollisionBucket(java.lang.String pactorName) {
    Engine.TileCoordinate tc = getPositionFor(pactorName);
    createCollisionBucketForTileCoordinateIfBucketAbsent(tc);
    sharedPactorLocationBuckets.get(tc).add(pactorName);
}