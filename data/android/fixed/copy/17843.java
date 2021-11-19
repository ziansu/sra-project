private void downDiagonal(int x, int y) {
    if (x < (this.x)) {
        leftDownDiagonal(x);
    }else {
        rightDownDiagonal(x);
    }
}