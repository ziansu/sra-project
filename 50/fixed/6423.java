public void write(final char character, final int columnIndex, final int rowIndex) {
    if (isPositionValid(columnIndex, rowIndex)) {
        strings[rowIndex].setCharacter(columnIndex, character);
    }
}