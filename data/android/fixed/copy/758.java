private java.lang.String ensureTrailingSeparator(final java.lang.String imageDirectory) {
    if ((imageDirectory.charAt(((imageDirectory.length()) - 1))) != (java.io.File.separatorChar)) {
        return imageDirectory + "/";
    }else {
        return imageDirectory;
    }
}