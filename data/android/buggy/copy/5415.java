@java.lang.Override
protected boolean isSafeTag(java.lang.String tag) {
    if (!(super.isSafeTag(tag))) {
        isValid = false;
    }
    return super.isSafeTag(tag);
}