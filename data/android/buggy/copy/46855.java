@java.lang.Override
public void visitFile(java.nio.file.Path path, java.nio.file.attribute.BasicFileAttributes attrs) {
    org.roda.rodain.core.PathCollection.simpleAddPath(path.toString());
    size += attrs.size();
    (filesCount)++;
    update();
}