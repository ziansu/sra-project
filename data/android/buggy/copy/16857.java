@java.lang.Override
public void postVisitDirectory(java.nio.file.Path path) {
    org.roda.rodain.core.PathCollection.simpleAddPath(path.toString());
    (directoryCount)++;
    update();
}