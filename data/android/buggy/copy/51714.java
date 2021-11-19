public void setIterations(int iterations) {
    if (iterations <= 0)
        this.iterations = 2;
    else
        this.iterations = iterations;
    
    renderingImage = javafx.embed.swing.SwingFXUtils.toFXImage(javafx.embed.swing.SwingFXUtils.fromFXImage(originalImage, null), null);
    transformImage();
}