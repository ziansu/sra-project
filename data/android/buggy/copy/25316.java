private boolean matchingAdjacent(int x, int y) {
    return (c_color[y][x]) == (c_color[(y + 1)][(x + 1)]);
}