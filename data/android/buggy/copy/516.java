public static void endSplashScreen() {
    if ((beast.app.util.Utils6.splashScreen) != null) {
        beast.app.util.Utils6.splashScreen.dispose();
        beast.app.util.Utils6.can = null;
    }
}