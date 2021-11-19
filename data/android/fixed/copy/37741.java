public void rm(@org.jetbrains.annotations.NotNull
java.nio.file.Path path) throws MyExceptions.UnknownProblem, java.io.IOException {
    ru.spbau.FileSystemWorker.delete(folders.repositoryPath.resolve(path));
    add(path);
}