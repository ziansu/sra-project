public void clearCache() {
    com.sun.javafx.css.StyleHelper.StyleCacheEntry entry = styleCache.get(this);
    if ((entry != null) && ((entry.entries) != null))
        entry.entries.clear();
    
}