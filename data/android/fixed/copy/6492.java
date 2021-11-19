private org.libreplan.web.common.OnlyOneVisible getVisibility() {
    if ((visibility) == null) {
        visibility = new org.libreplan.web.common.OnlyOneVisible(listWindow, editWindow);
    }
    return visibility;
}