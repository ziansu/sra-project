public java.awt.FontMetrics getFontMetrics(java.awt.Font font) {
    if ((gc) != null)
        return gc.getFontMetrics(font);
    else
        return null;
    
}