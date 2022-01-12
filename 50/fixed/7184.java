public int[] getDimensions() {
    util.X11InfoGatherer gatherer = new util.X11InfoGatherer();
    return gatherer.getWindowAttributes(parentWindowId);
}