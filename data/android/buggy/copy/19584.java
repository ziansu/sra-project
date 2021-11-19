public com.github.codechapin.postcss.Root parse(final java.io.Reader reader) {
    reset();
    loop(reader);
    return root;
}