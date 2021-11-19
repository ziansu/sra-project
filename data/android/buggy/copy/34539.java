public void undo() {
    dragHelper.isUndoing(true);
    alphaMaker.undo();
    dragHelper.isUndoing(false);
    invalidate();
}