public void setContent(java.awt.image.RenderedImage image) {
    try {
        setContent((image == null ? null : org.zkoss.image.Images.encode("a.png", image)));
    } catch (java.io.IOException ex) {
        throw new org.zkoss.zk.ui.UiException(ex);
    }
}