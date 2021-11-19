public <W extends java.lang.Appendable & Closeable> void copy(OutputSupplier<W> to) {
    InputSupplier<InputStreamReader> supplier = newReaderSupplier();
    if (supplier != null) {
        CharStreams.copy(supplier, to);
    }
}