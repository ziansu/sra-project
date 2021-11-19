public javax.swing.ImageIcon getImage() throws java.io.IOException {
    try (java.io.InputStream is = com.massisframework.testdata.SampleHomesLoader.class.getClassLoader().getResourceAsStream(((SampleHomesLoader.SAMPLES_BUILDING_DIR) + (this.image)))) {
        return new javax.swing.ImageIcon(javax.imageio.ImageIO.read(is));
    }
}