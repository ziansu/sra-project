public boolean commit() {
    if ((changeTracker.connection().get()) == null)
        return false;
    
    changeTracker.connection().get().asyncExecute(toString());
    return true;
}