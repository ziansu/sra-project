public void split(com.builtbroken.icbm.content.launcher.controller.remote.antenna.TileAntennaPart splitPoint) {
    if (this.contains(splitPoint)) {
        com.builtbroken.icbm.content.launcher.controller.remote.antenna.TileAntenna base = this.base;
        kill();
        if (splitPoint != base) {
            base.doInitScan();
        }
    }
}