public java.lang.String readConstLengthString(int length) throws java.io.IOException {
    byte[] string = new byte[length];
    this.read(string);
    return new java.lang.String(string, charset);
}