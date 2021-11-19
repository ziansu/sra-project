protected java.util.Collection<T> loadFiles() {
    final java.lang.String directory = getFileDirectory();
    final java.lang.String postfix = getFileExtension();
    final java.util.Collection<T> loadedTypes = fileRepositorySupport.load(entityClass, directory, postfix);
    return loadedTypes;
}