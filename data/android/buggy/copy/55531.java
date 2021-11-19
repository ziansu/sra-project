private java.lang.String width() {
    if ((task().getSize()) == null)
        return "";
    
    return task().getSize().getWidth(formatFromQuality(), locale);
}