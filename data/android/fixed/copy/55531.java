private java.lang.String width() {
    return (task().getSize()) == null ? task().getSize().getWidth(formatFromQuality(), locale) : "";
}