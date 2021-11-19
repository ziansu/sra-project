public static void onNewGeneration() {
    net.net16.jeremiahlowe.fighters.Fighters.g_fps.stop();
    while (net.net16.jeremiahlowe.fighters.Fighters.g_fps.isRunning()) {
    } 
    net.net16.jeremiahlowe.fighters.ai.GenerationController.killCurrentGeneration();
    net.net16.jeremiahlowe.fighters.ai.GenerationController.spawnNewGenerationFromGenePool(net.net16.jeremiahlowe.fighters.Fighters.ERROR_CHANCE, true, 0);
    net.net16.jeremiahlowe.fighters.Fighters.g_fps.start();
}