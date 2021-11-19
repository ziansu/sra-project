private byte[] replace(byte[] buf) {
    java.lang.String replacedStr = replaceProtocols(new java.lang.String(buf, 0, buf.length));
    byte[] rtnByte = replacedStr.getBytes();
    return rtnByte;
}