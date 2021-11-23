private int getShapeY() {
    if (sizeConstrainedWithWidth()) {
        return ((getPanelHeight()) - (getShapeHeight())) / 2;
    }else {
        return getBorderSize();
    }
}