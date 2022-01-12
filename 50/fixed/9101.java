private static float resolveWidth(float width, float defaultWidth) {
    return (width == 0) || (width != width) ? defaultWidth : width;
}