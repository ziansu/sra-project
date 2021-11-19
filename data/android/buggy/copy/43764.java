private static byte[] feistelFunction(byte[] key, byte[] right) {
    byte[] feisted = fiestel.cipher.FiestelCipher.getXORKey(right, key);
    return feisted;
}