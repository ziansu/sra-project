final int getBytes() {
    return getData().getBytes(java.nio.charset.Charset.forName("UTF-8")).length;
}