public <R extends java.lang.Readable & Closeable> void copy(InputSupplier<R> from) {
    OutputSupplier<OutputStreamWriter> supplier = newWriterSupplier();
    if (supplier != null) {
        CharStreams.copy(from, supplier);
    }
}