public void setNumThreads(int threads) {
    if ((threads < 1) || (threads > 100)) {
        throw new java.lang.IllegalArgumentException("Threads must be in [0, 100]");
    }
}