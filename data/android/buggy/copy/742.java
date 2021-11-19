public void focusLost() {
    org.geogebra.web.html5.euclidian.EuclidianViewW.actualTabIndex = thisTabIndex;
    if (isInFocus) {
        this.isInFocus = false;
        this.app.focusLost(this);
    }
}