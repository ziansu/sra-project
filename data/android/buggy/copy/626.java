public int getFirst() {
    if ((needLoop) && ((views.size()) > 2)) {
        return (getRealCount()) + 1;
    }else {
        return 0;
    }
}