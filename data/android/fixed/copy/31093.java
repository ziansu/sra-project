public static javafx.scene.image.Image getSvgImage(final java.lang.String path) {
    final java.io.InputStream imageStream = it.unibo.alchemist.boundary.gui.utility.ResourceLoader.load(path);
    return new javafx.scene.image.Image(imageStream);
}