public model.MouseThread.RectRowCol getActivePoint() {
    model.MouseThread.RectRowCol rc = new model.MouseThread.RectRowCol();
    rc.rowIndex = iActiveRow;
    rc.colIndex = iActiveCol;
    return rc;
}