protected void finalize() throws java.lang.Throwable {
    mClosures.clear();
    super.finalize();
}