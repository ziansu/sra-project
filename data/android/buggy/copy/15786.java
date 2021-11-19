@java.lang.Override
public boolean accept(java.io.File file) {
    java.lang.String relativePath = com.github.dockerjava.core.FilePathUtil.relativize(base, file);
    boolean match = com.github.dockerjava.core.GoLangFileMatch.match(patterns, relativePath);
    return !match;
}