@java.lang.Override
public void postVisitDirectory(java.nio.file.Path path) {
    (directoryCount)++;
    update();
}