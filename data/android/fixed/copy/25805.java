public java.lang.Object getRenderingHint(java.awt.RenderingHints.Key key) {
    if ((gc) != null)
        return gc.getRenderingHint(key);
    else
        return null;
    
}