public com.brouding.simpledialog.SimpleDialog.Builder showProgress(boolean showProgress) {
    if ((this.customView) != null) {
        throw new java.lang.IllegalStateException("You cannot use showProgress() when you want customView");
    }
    this.showProgress = showProgress;
    return this;
}