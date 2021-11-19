private static void doRollback(@org.jetbrains.annotations.NotNull
final com.intellij.openapi.vcs.ex.LineStatusTracker tracker, @org.jetbrains.annotations.NotNull
final com.intellij.openapi.vcs.ex.Range range) {
    com.intellij.openapi.vcs.ex.RollbackLineStatusAction.execute(tracker, () -> tracker.rollbackChanges(range));
}