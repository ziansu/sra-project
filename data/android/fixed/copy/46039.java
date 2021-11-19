public com.jenjinstudios.io.connection.ConnectionBuilder<T> withShutdownCallbacks(java.util.function.Consumer<com.jenjinstudios.io.connection.Connection<T>>... tasks) {
    java.util.Collections.addAll(shutdownCallbacks, tasks);
    return this;
}