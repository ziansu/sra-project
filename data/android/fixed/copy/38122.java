public static int crypto_box_keypair(byte[] pk, byte[] sk) {
    java.security.SecureRandom rng = new java.security.SecureRandom();
    rng.nextBytes(sk);
    return curve25519.crypto_scalarmult_base(pk, sk);
}