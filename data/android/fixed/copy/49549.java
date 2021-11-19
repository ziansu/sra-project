public int touchCodeFromPosition(int hexagonCol, int hexagonRow) {
    return ((hexagonRow * (layoutWidthInHexagons)) + hexagonCol) + 1;
}