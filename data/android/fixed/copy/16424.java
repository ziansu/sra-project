@java.lang.Override
public void resetNativeObject() throws java.lang.Exception {
    setNativeObject(nativeClass.newInstance());
}