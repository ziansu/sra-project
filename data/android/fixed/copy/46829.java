public void run() {
    if ((getLeft()) == 0) {
        this.cancel();
        end();
        return ;
    }
    this.run(getLeft());
    (left)--;
}