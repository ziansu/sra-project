public boolean freeze() {
    if ((mBuilderPtr) == 0) {
        throw new java.lang.IllegalStateException("This FontFamily is already frozen");
    }
    mNativePtr = android.graphics.FontFamily.nCreateFamily(mBuilderPtr);
    mBuilderPtr = 0;
    return (mNativePtr) != 0;
}