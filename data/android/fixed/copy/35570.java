@java.lang.Override
public java.io.File getCanonicalFile() throws java.io.IOException {
    return (canonicalFile) != null ? canonicalFile : (canonicalFile = net.filebot.util.FastFile.get(super.getCanonicalFile()));
}