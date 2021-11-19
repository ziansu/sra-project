public void toggleMaxZoom() {
    if (valerino.vgcamera.AppConfiguration.instance(_context).maxZoomMode()) {
        setMaxZoom();
    }else {
        setZoom(0);
    }
}