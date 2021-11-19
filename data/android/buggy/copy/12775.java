public static byte[] getPskSharedSecret(byte[] receiverSecret, byte[] token) {
    byte[] generator = org.interledger.psk.io.PskUtils.hmac(receiverSecret, org.interledger.psk.io.PskUtils.PSK_GENERATION_STRING);
    return java.util.Arrays.copyOf(org.interledger.psk.io.PskUtils.hmac(generator, token), org.interledger.psk.io.PskUtils.SHARED_SECRET_LENGTH);
}