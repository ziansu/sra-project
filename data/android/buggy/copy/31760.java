@java.lang.Override
public java.nio.file.FileVisitResult preVisitDirectory(java.nio.file.Path dir, java.nio.file.attribute.BasicFileAttributes attrs) throws java.io.IOException {
    com.service.folderChange.FolderWatchServiceImpl.logger.debug((("Scanning " + dir) + " ..."));
    register(dir);
    return java.nio.file.FileVisitResult.CONTINUE;
}