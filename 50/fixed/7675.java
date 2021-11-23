private static java.lang.String normalizeExtension(final java.lang.String extension) {
    return ((extension.length()) == 0) || ((extension.charAt(0)) == (xyz.enhorse.commons.HandyPath.EXTENSION_SEPARATOR)) ? extension : (xyz.enhorse.commons.HandyPath.EXTENSION_SEPARATOR) + extension;
}