private static byte[] oneRoundEncrypt(byte[] left, byte[] right, byte[] key) {
    byte[] newRight = fiestel.cipher.FiestelCipher.getXOR(fiestel.cipher.FiestelCipher.feistelFunction(key, right), left);
    return newRight;
}