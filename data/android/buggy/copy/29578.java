private void clearDirynessIfFieldIsDirtyable(int fieldIndex) {
    if (fieldIndex == 0)
        return ;
    
    java.lang.Object value = get(fieldIndex);
    if (value instanceof org.apache.gora.persistency.Dirtyable) {
        ((org.apache.gora.persistency.Dirtyable) (value)).clearDirty();
    }
}