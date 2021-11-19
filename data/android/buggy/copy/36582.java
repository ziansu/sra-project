public static io.inkstand.scribble.pdf.PDF of(byte[] data) {
    byte[] bytes = new byte[data.length];
    java.lang.System.arraycopy(data, 0, bytes, 0, data.length);
    return new io.inkstand.scribble.pdf.PDF(data);
}