static void clearInstance() {
    if ((com.fubaisum.imageselector.lib.ImageSelector.instance) != null) {
        com.fubaisum.imageselector.lib.ImageSelector.instance.hook = null;
        com.fubaisum.imageselector.lib.ImageSelector.instance = null;
    }
}