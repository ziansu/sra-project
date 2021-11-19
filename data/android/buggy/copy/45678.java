@java.lang.Override
public java.lang.Void execute(java.util.concurrent.Future<java.lang.Void> future) throws java.lang.Throwable {
    assertTrue(future.hasError());
    finished.set(true);
    return null;
}