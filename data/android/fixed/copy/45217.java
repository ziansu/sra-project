public static void removeView() {
    if (((com.idoideas.xoutof10.OverlayService.view) != null) && ((com.idoideas.xoutof10.OverlayService.windowManager) != null)) {
        com.idoideas.xoutof10.OverlayService.windowManager.removeView(com.idoideas.xoutof10.OverlayService.view);
    }
}