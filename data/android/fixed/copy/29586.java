private void stopCrawling() {
    if ((this.cycleRunners_) != null) {
        for (com.samsanort.yac4j.process.CycleRunner runner : this.cycleRunners_) {
            runner.kill();
        }
        this.cycleRunners_ = null;
    }
}