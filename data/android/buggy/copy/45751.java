@java.lang.Override
public boolean exists(java.lang.Object element) {
    if (element instanceof java.lang.String)
        return (lruCache.getIfPresent(element)) == null;
    else
        return false;
    
}