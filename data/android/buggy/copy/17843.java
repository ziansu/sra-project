private void downDiagonal(int x, int y) {
    if (x < (this.x)) {
        leftDownDiagonal(y);
    }else {
        rightDownDiagonal(x);
    }
}