public static packet createACK(int SeqNum) throws java.lang.Exception {
    return new packet(0, SeqNum, new java.lang.String());
}