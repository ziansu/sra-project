@java.lang.Override
public anuled.dynamicstore.TileReader.Pixel next() {
    anuled.dynamicstore.TileReader.Pixel pixel = new anuled.dynamicstore.TileReader.Pixel(row, col);
    (col)++;
    if ((col) >= (pixelWidth)) {
        (row)++;
        col = 0;
    }
    return pixel;
}