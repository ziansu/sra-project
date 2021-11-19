public byte[] getPkg() {
    synchronized(rpool) {
        if (!(rpool.isEmpty())) {
            return ((byte[]) (rpool.removeFirst()));
        }
    }
    return null;
}