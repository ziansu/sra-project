protected void launchThread(ultimate.karoapi4j.utils.threads.QueuableThread th) {
    th.start(((this.currId)++));
    synchronized(this.noT) {
        (this.noT)++;
    }
}