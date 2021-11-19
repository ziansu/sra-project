public void flush() throws java.io.IOException {
    if ((out) != null) {
        out.flush();
        if (!(keepAlive)) {
            out.close();
            out = null;
        }
    }
}