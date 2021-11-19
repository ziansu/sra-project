static void clearInstance() {
    if ((com.scausum.imageselector.lib.ImageSelector.instance) != null) {
        com.scausum.imageselector.lib.ImageSelector.instance.hook = null;
        com.scausum.imageselector.lib.ImageSelector.instance = null;
    }
}