@java.lang.Override
public void run(@org.jetbrains.annotations.NotNull
com.intellij.openapi.progress.ProgressIndicator indicator) {
    com.intellij.openapi.vfs.VirtualFileManager.getInstance().refreshWithoutFileWatcher(true);
    com.jetbrains.ther.interpreter.TheRSkeletonGenerator.runSkeletonGeneration();
}