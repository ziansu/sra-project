public void encode(int i) throws java.io.IOException {
    outputStream.write(org.benjamin.Bencoder.INTEGER_MARK);
    outputStream.write(java.lang.Integer.toString(i).getBytes());
    outputStream.write(org.benjamin.Bencoder.END_MARK);
}