@java.lang.Override
public void hScrollbarChanged(int value) {
    if (!(this.updatingZoom)) {
        this.viewportTopLeft.x = ((double) (value));
        this.view.update();
    }
}