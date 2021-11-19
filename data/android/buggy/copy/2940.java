public void write(java.lang.String s) {
    try {
        writer.write(s);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}