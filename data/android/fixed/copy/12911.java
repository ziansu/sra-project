@java.lang.Override
public void goTo(com.lyft.scoop.Screen screen) {
    super.goTo(new com.adriencadet.wanderer.ui.screens.fullscreen.LandingFullscreenScreen());
    if (screen instanceof com.adriencadet.wanderer.ui.screens.PlaceInsightScreen) {
        bodyRouter.goTo(screen);
    }else {
        timber.log.Timber.e("Invalid screen");
    }
}