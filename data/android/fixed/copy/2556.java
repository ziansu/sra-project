protected void cancelAlternateOverlay() {
    this.setDisplayImage(refCommandable.getSelectButtonImage());
    this.setAlternateOverlay(refCommandable.getSelectButtonImage());
    this.alternateOverlay = null;
}