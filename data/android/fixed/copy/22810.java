@java.lang.Override
public java.nio.file.FileVisitResult visitFile(java.nio.file.Path file, java.nio.file.attribute.BasicFileAttributes attrs) throws java.io.IOException {
    alien4cloud.utils.FileUtil.putTarEntry(tarArchiveOutputStream, new org.apache.commons.compress.archivers.tar.TarArchiveEntry(alien4cloud.utils.FileUtil.getChildEntryRelativePath(basePath, file, true)), file);
    return java.nio.file.FileVisitResult.CONTINUE;
}