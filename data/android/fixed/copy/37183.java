public int getStyle(int styleId, int theme) {
    int[] styles = getStyleList(styleId);
    return styles == null ? 0 : styles[theme];
}