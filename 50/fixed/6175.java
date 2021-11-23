public java.lang.String addItem(de.iceburner.apps.serapeum.lib.LibraryItem item) {
    java.lang.String key = createKey(item.getName().substring(0, 4), mLibraryItems);
    mLibraryItems.put(key, item);
    return key;
}