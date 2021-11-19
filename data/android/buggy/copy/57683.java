public void setWorldSimulatorScreen(edu.miamioh.Level.Level level) {
    edu.miamioh.Configuration.Configuration defaultConfig = verilogWorldController.getDefaultConfig();
    worldSimulatorController = new edu.miamioh.worldSimulator.WorldSimulatorController(defaultConfig, level);
    worldSimulatorScreen = new edu.miamioh.worldSimulator.WorldSimulatorScreen(worldSimulatorController);
    this.setScreen(worldSimulatorScreen);
}