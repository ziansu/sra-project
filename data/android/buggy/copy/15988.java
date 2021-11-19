public void destroy() {
    if ((sc) != null) {
        ol.destroy();
        mgrab.remove();
    }
    release(xl);
    disol(17);
}