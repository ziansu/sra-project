@java.lang.Override
public void setProperty(final java.lang.String key, final java.lang.Object value) {
    setCurrentGraphInThreadLocal();
    if ((rawElement) == null)
        convertToDocument();
    
    super.setProperty(key, value);
}