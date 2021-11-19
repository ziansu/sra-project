private int hash(java.lang.String key, int mod) {
    return (key.hashCode()) % mod;
}