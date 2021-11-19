private java.lang.String height() {
    return (task().getSize()) != null ? task().getSize().getHeight(formatFromQuality(), locale) : "";
}