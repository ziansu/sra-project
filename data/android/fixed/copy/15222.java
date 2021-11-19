@java.lang.Override
public void seek(long pos) throws java.io.IOException {
    this.pos += this.in.skip((pos - (this.pos)));
}