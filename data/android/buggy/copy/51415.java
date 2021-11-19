public com.brouding.simpledialog.SimpleDialog.Builder setPermanentCheck(@android.support.annotation.NonNull
java.lang.String preferenceName, @android.support.annotation.NonNull
java.lang.String preferenceKey) {
    if (this.showProgress) {
        throw new java.lang.IllegalStateException("'setPermanentCheck' is unavailable when you want showProgress()");
    }
    this.preferenceName = preferenceName;
    this.permanentCheckKey = preferenceKey;
    return this;
}