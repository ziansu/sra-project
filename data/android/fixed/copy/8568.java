private int getShapeX() {
    if (sizeConstrainedWithWidth()) {
        return getBorderSize();
    }else {
        return ((getPanelWidth()) - (getShapeWidth())) / 2;
    }
}