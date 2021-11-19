public org.opendaylight.yang.gen.v1.urn.opendaylight.genius.idmanager.rev160406.id.pools.id.pool.AvailableIdsHolder createAvailableIdsHolder(long low, long high, long cursor) {
    return new org.opendaylight.yang.gen.v1.urn.opendaylight.genius.idmanager.rev160406.id.pools.id.pool.AvailableIdsHolderBuilder().setStart(low).setEnd(high).setCursor(cursor).build();
}