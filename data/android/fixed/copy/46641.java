@mockit.internal.util.Nonnull
private static java.lang.String getOwnerClassDesc(@mockit.internal.util.Nonnull
java.lang.Class<?> rawType) {
    return rawType.getName().replace('.', '/');
}