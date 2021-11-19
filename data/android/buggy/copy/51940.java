public void setLayer(fr.pigeo.rimap.rimaprcp.riskcatalog.AbstractLayer wms) {
    this.layer = wms;
    this.layerName = wms.getName();
    this.updateDisplay();
    this.imgLegendData = new org.eclipse.swt.graphics.ImageData("/home/jean/tmp/shutter_Sélection_014.png");
}