public java.lang.String getLocation() {
    if (null == (mParts)) {
        return "";
    }
    if ((mParts.length) < 2) {
        return "";
    }
    return mParts[1];
}