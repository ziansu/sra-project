public float getLength(java.lang.String string) {
    int width = 0;
    for (char c : string.toCharArray())
        width += (widths[c]) * (scale);
    
    return width;
}