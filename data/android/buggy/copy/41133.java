private java.math.BigInteger encryptDecrypt(java.math.BigInteger message, java.math.BigInteger key) {
    return message.modPow(key, getN());
}