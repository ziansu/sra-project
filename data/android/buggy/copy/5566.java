public static java.io.File getResource(java.lang.String path) {
    java.net.URL resource = mobi.hsz.idea.gitignore.util.Resources.class.getResource(path);
    assert resource != null;
    return new java.io.File(resource.getPath());
}