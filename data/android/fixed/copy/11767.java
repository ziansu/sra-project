private int roiVerticalOffset(java.awt.Rectangle roi, java.awt.Rectangle sensor) {
    return ((roi.y) + ((roi.height) / 2)) - ((sensor.height) / 2);
}