private static void disableAnimations() {
    int permStatus = org.xbmc.kore.testhelpers.Utils.context.checkCallingOrSelfPermission(org.xbmc.kore.testhelpers.Utils.ANIMATION_PERMISSION);
    if (permStatus == (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
        org.xbmc.kore.testhelpers.Utils.setSystemAnimationsScale(org.xbmc.kore.testhelpers.Utils.DISABLED);
    }
}