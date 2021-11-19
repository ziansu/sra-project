private boolean editorHasWarnings() {
    if (this.canCheckWarning())
        return this.hasWarnings();
    
    return false;
}