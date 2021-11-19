private void updateVisualizer() {
    if (((visualizer) != null) && (visualizer.isRunning())) {
        visualizer.updateVisualizer(graph);
    }
}