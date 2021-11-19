protected int getOffsetAtCoordinate(int line, float x) {
    x = convertToLocalHorizontalCoordinate(x);
    return getLayout().getOffsetForHorizontal(line, x);
}