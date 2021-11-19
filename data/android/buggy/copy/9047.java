private void detectShots(java.awt.image.BufferedImage workingCopy, java.util.ArrayList<com.shootoff.camera.ShotDetection.PixelCluster> clusters) {
    org.openimaj.util.parallel.Parallel.forEach(clusters, new org.openimaj.util.function.Operation<com.shootoff.camera.ShotDetection.PixelCluster>() {
        public void perform(com.shootoff.camera.ShotDetection.PixelCluster cluster) {
            addShot(workingCopy, cluster);
        }
    });
}