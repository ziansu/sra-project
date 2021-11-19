private int getShapeX() {
    if (sizeConstrainedWithWidth()) {
        return 0;
    }else {
        return (((getPanelWidth()) - (getShapeWidth())) / 2) - (getBorderSize());
    }
}