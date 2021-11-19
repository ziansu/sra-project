public void focusGained() {
    org.geogebra.web.html5.euclidian.EuclidianViewW.actualTabIndex = thisTabIndex;
    if ((!(isInFocus)) && (!(org.geogebra.common.main.App.isFullAppGui()))) {
        this.isInFocus = true;
        this.app.focusGained(this);
    }
}