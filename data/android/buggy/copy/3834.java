private java.awt.Dimension autoContentsFitSize() {
    if ((this.preferredWidth) != (-1)) {
        flatAutoResizeListener.setContentsFitSize(preferredWidth);
    }else {
        flatAutoResizeListener.setContentsFitSize();
    }
    return flatAutoResizeListener.getPreferredSize();
}