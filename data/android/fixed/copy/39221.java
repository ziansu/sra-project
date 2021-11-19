@java.lang.Override
public com.github.fishio.logging.IHandler getIHandler() {
    return new com.github.fishio.logging.TxtFileHandler(new java.io.File(folder.getRoot(), filename));
}