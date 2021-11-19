public com.rockaport.alice.AliceContext build() {
    return new com.rockaport.alice.AliceContext(algorithm, mode, padding, keyLength, macAlgorithm, pbkdf, iterations);
}