private boolean isInBounds(int x, int y) {
    return (((x > (rect.left)) && (x < (rect.right))) && (y > (rect.top))) && (y < (rect.bottom));
}