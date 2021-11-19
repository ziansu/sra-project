public boolean isInBounds(int xIndex, int yIndex) {
    return ((xIndex >= (minX)) && (yIndex <= (maxX))) && ((yIndex >= (minY)) && (yIndex <= (maxY)));
}