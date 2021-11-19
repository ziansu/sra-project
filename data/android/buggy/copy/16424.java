@java.lang.Override
public void resetNativeObject() throws java.lang.Exception {
    setNativeObject(nativeClass.newInstance());
    if ((jsonMap) != null) {
        jsonMap.clear();
    }
    if ((nativeObjectMap) != null) {
        nativeObjectMap.clear();
    }
}