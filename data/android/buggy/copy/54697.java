public static long hash(long l) {
    return net.openhft.chronicle.bytes.algo.OptimisedBytesStoreHash.hash0(l, ((l >> 32) * (K1)));
}