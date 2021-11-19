public <R extends java.lang.Readable & Closeable> void copy(InputSupplier<R> from) {
    CharStreams.copy(from, newWriterSupplier());
}