public byte[] getSubnegotiation() {
    byte[] result = new byte[this.subnegotiation.length];
    java.lang.System.arraycopy(subnegotiation, 0, result, 0, subnegotiation.length);
    return result;
}