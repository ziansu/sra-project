public static boolean initUnthreaded() {
    try {
        extendedrenderer.shadertest.gametest.Main.init();
        extendedrenderer.shadertest.gametest.Main.gameEngine.init();
        return true;
    } catch (java.lang.Exception excp) {
        excp.printStackTrace();
    }
    return false;
}