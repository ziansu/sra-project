public static boolean isValidPreRelease(java.lang.String preRelease) {
    return (preRelease != null) && ((preRelease.isEmpty()) || (de.skuzzle.semantic.Version.PRE_RELEASE.matcher(preRelease).matches()));
}