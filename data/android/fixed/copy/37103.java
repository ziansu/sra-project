@java.lang.Override
public void close() throws java.io.IOException {
    try {
        this.write(this.x, this.z, buf, count);
    } finally {
        super.close();
    }
}