protected void finalize() throws java.lang.Throwable {
    friend.depth = 0;
    super.finalize();
}