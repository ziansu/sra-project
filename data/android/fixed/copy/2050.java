private void conway() {
    for (android.graphics.Point toToggle : togglePoints()) {
        cellLoc[toToggle.x][toToggle.y].toggleLive();
    }
}