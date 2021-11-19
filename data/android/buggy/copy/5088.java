public static void handleCapturedException(java.lang.Exception e) {
    if ((e instanceof java.lang.InterruptedException) || (e instanceof org.swerverobotics.library.internal.RuntimeInterruptedException));
    java.lang.Thread.currentThread().interrupt();
    throw org.swerverobotics.library.internal.SwerveRuntimeException.wrap(e);
}