private org.atlasapi.remotesite.pa.deletes.ExistingItemUnPublisher existingItemUnPublisher() {
    return org.atlasapi.remotesite.pa.deletes.ExistingItemUnPublisher.create(contentResolver, contentWriter, lookupEntryStore, org.atlasapi.equiv.EquivalenceBreaker.create(contentResolver, lookupEntryStore, lookupWriter));
}