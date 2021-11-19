public void onDrawFrame(javax.microedition.khronos.opengles.GL10 gl) {
    if (ch.fhnw.comgr.GLES3Lib.onUpdateAndPaint())
        GLES3Lib.view.requestRender();
    
    if (ch.fhnw.comgr.GLES3Lib.shouldClose())
        ch.fhnw.comgr.GLES3Lib.onClose();
    
}