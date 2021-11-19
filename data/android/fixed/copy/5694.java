public static com.google.common.hash.HashCode hashResource(final java.nio.file.Path in, final java.util.function.Consumer<java.io.IOException> onFailure) {
    return org.danilopianini.util.Hashes.hashResource(new org.danilopianini.util.InputStreamIterator(in, onFailure));
}