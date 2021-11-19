private static java.lang.String getClassNameFromFile(java.io.File file) {
    return file.getName().substring(0, ((file.getName().length()) - (spaska.framework.PackageClassesDiscovery.CLASS_SUFFIX_LENGTH)));
}