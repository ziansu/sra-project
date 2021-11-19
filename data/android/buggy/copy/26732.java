public boolean store(android.content.Context context) {
    boolean wasStore;
    if (hasPrimaryKeyValue())
        wasStore = update(context);
    else
        wasStore = insert(context);
    
    return wasStore;
}