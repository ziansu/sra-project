private static boolean hasSubPackage(@mockit.internal.capturing.Nonnull
java.lang.String nameOrDesc, int offset, @mockit.internal.capturing.Nonnull
java.lang.String subPackage) {
    return nameOrDesc.regionMatches(offset, subPackage, 0, subPackage.length());
}