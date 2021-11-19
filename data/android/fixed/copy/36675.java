public static void collectStorables(java.util.List<prompto.store.IStorable> storables, prompto.store.IStorable storable) {
    if (storable == null)
        return ;
    
    if (storable.isDirty())
        storables.add(storable);
    
}