public static void initUnthreaded() {
    try {
        extendedrenderer.shadertest.gametest.Main.init();
        extendedrenderer.shadertest.gametest.Main.gameEngine.init();
    } catch (java.lang.Exception excp) {
        excp.printStackTrace();
        java.lang.System.exit((-1));
    }
}