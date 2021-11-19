@java.lang.Override
public void vScrollbarChanged(int value) {
    this.viewportTopLeft.y = ((double) (value));
    if (!(this.updatingZoom)) {
        this.view.update();
    }
}