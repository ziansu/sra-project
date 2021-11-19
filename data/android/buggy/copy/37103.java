@java.lang.Override
public void close() throws java.io.IOException {
    try {
        this.write(x, z, buf, count);
    } finally {
        super.close();
    }
}