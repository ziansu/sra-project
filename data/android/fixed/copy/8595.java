public void left() {
    if ((y) > 0) {
        synchronized(board) {
            remove(board, world);
            this.y -= 1;
            print(board);
        }
    }
}