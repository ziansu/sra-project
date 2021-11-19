protected org.opendaylight.yang.gen.v1.urn.opendaylight.genius.idmanager.rev160406.id.pools.id.pool.ReleasedIdsHolder createReleasedIdsHolder(long availableIdCount, long delayTime) {
    return new org.opendaylight.yang.gen.v1.urn.opendaylight.genius.idmanager.rev160406.id.pools.id.pool.ReleasedIdsHolderBuilder().setAvailableIdCount(availableIdCount).setDelayedTimeSec(delayTime).build();
}