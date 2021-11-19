public boolean checkCell(int i) {
    return (defined.get(i, cells[i])) != (cells[i]);
}