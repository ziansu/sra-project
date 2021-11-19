@java.lang.Override
public void vScrollbarChanged(int value) {
    if (!(this.updatingZoom)) {
        this.viewportTopLeft.y = ((double) (value));
        this.view.update();
    }
}