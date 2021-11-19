@java.lang.Override
public void setAutoFormat(boolean autoFormat) {
    super.setAutoFormat(autoFormat);
    if (autoFormat) {
        cachedFormats.clear();
    }
}