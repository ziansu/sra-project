public void up() {
    synchronized(board) {
        remove(board, world);
        this.x -= 1;
        print(board);
    }
}