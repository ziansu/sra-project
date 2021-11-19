public void restart(org.fusesource.hawtbuf.Buffer sequence) {
    this.buf = sequence.getData();
    this.pos = sequence.getOffset();
    this.length = sequence.getLength();
}