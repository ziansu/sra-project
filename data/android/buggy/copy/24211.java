public void setOutline(boolean outline) {
    this.painter = (outline) ? new de.tucottbus.kt.lcars.j2d.GArea.Outliner() : new de.tucottbus.kt.lcars.j2d.GArea.Filler();
}