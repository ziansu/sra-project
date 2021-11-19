public boolean checkCell(int i) {
    return (defined.get(i, (-1))) != (cells[i]);
}