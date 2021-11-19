public void focusGained() {
    if ((!(isInFocus)) && (!(org.geogebra.common.main.App.isFullAppGui()))) {
        this.isInFocus = true;
        this.app.focusGained(this);
    }
}