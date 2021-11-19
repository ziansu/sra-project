public void collectStorables(java.util.List<prompto.store.IStorable> storables) {
    prompto.store.IStorable storable = getStorable();
    if ((storable != null) && (storable.isDirty()))
        storables.add(storable);
    
}