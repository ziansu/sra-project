@java.lang.Override
public void hScrollbarChanged(int value) {
    this.viewportTopLeft.x = ((double) (value));
    if (!(this.updatingZoom)) {
        this.view.update();
    }
}