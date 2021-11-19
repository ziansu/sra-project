@java.lang.Override
public void selectedImageChanged(org.openstreetmap.josm.plugins.mapillary.MapillaryAbstractImage oldImage, org.openstreetmap.josm.plugins.mapillary.MapillaryAbstractImage newImage) {
    if (newImage != (oldImage.next())) {
        interrupt();
    }
}