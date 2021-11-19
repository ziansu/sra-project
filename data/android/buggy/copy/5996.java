@java.lang.Override
public void setDateEnabled(boolean dateEnabled) {
    super.setDateEnabled(dateEnabled);
    cachedFormats.clear();
    setDirty(true);
    revalidate();
}