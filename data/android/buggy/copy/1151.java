public org.cocos2dx.lib.Cocos2dxGLSurfaceView onCreateView() {
    org.cocos2dx.lib.Cocos2dxGLSurfaceView glSurfaceView = new org.cocos2dx.lib.Cocos2dxGLSurfaceView(this);
    glSurfaceView.setEGLConfigChooser(5, 6, 5, 0, 16, 8);
    return glSurfaceView;
}