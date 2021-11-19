@java.lang.Override
public void addCollection(final org.exist.collections.Collection collection) {
    if (!(collectionIds.get(collection.getId()))) {
        collectionIds.set(collection.getId());
        collections.add(collection);
    }
}