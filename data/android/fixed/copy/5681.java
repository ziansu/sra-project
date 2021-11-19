public void start() {
    if (!(this.stopped)) {
        return ;
    }
    if ((frames.size()) == 0) {
        return ;
    }
    this.stopped = false;
}