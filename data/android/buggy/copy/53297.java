processing.javafx.PGraphicsFX2D.FontInfo get(java.lang.String name, float size) {
    if (nonNativeNames.contains(name)) {
        return processing.javafx.PGraphicsFX2D.FontInfo.NON_NATIVE;
    }
    retrievingKey.name = name;
    retrievingKey.size = size;
    return cache.get(retrievingKey);
}