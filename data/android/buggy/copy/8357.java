private void checkGLError(final java.lang.String message, final boolean throwException) {
    if (de.lessvoid.coregl.CoreTexture2D.errorChecks) {
        gl.checkGLError(message, throwException);
    }
}