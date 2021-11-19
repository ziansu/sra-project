public int[] decrypt(int[] cipher, int[] key) {
    bonek.Block[] b = toArrayBlock(cipher);
    key = bonek.Keygen.normalize(key);
    return toArrayInt(decrypt(b, key));
}