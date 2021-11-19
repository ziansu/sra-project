private void detectShots(java.awt.image.BufferedImage workingCopy, java.util.ArrayList<com.shootoff.camera.ShotDetection.PixelCluster> clusters) {
    for (com.shootoff.camera.ShotDetection.PixelCluster cluster : clusters) {
        addShot(workingCopy, cluster);
    }
}