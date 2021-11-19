private void setDefaultProjectionMatrix() {
    if ((getClearGLWindow()) != null)
        getClearGLWindow().setPerspectiveProjectionMatrix(0.785F, 1, 0.1F, 1000);
    
}