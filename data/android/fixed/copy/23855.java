static void onActivityDestroyed() {
    if ((com.karumi.dexter.Dexter.instance) != null) {
        com.karumi.dexter.Dexter.instance.onActivityDestroyed();
    }
}