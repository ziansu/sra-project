private void generateBloomPasses() {
    if (renderingConfig.isBloom()) {
        org.terasology.monitoring.PerformanceMonitor.startActivity("Generating Bloom Passes");
        generateHighPass();
        generateBloom(buffers.sceneBloom0);
        generateBloom(buffers.sceneBloom1);
        generateBloom(buffers.sceneBloom2);
        org.terasology.monitoring.PerformanceMonitor.endActivity();
    }
}