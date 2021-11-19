public static boolean isValidPreRelease(java.lang.String preRelease) {
    if (preRelease == null) {
        return false;
    }else
        if (preRelease.isEmpty()) {
            return true;
        }
    
    return de.skuzzle.semantic.Version.PRE_RELEASE.matcher(preRelease).matches();
}