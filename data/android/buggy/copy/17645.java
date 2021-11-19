@java.lang.Override
public java.io.File getParentFile() {
    return (parentFile) != null ? parentFile : (parentFile = new net.filebot.util.FastFile(super.getParentFile()));
}