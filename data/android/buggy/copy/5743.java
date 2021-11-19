void bindShadersNative() {
    if ((org.gearvrf.GVRScene.sBindShadersFromNative) == null) {
        org.gearvrf.GVRScene.sBindShadersFromNative = new java.lang.Runnable() {
            public void run() {
                bindShaders(getRoot());
            }
        };
    }
    getGVRContext().runOnTheFrameworkThread(org.gearvrf.GVRScene.sBindShadersFromNative);
}