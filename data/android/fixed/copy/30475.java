public java.lang.String updateTitle() {
    util.X11InfoGatherer gatherer = new util.X11InfoGatherer();
    title = gatherer.getWindowName(titleWindowId);
    return title;
}