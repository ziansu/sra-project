public void restore() {
    if (!(maximized)) {
        return ;
    }
    setWidth(restoreWindowWidth);
    setHeight(restoreWindowHeight);
    setX(restoreWindowX);
    setY(restoreWindowY);
    maximized = false;
}