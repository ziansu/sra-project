public void rm(@org.jetbrains.annotations.NotNull
java.nio.file.Path path) throws MyExceptions.UnknownProblem, java.io.IOException {
    path = folders.repositoryPath.resolve(path);
    ru.spbau.FileSystemWorker.delete(path);
    add(path);
}