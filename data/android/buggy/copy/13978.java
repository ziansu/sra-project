public boolean loadLibrary() {
    if (loadLibrary)
        return loadLibrary;
    
    try {
        java.lang.System.loadLibrary("scale");
        return true;
    } catch (java.lang.UnsatisfiedLinkError exception) {
        return false;
    }
}