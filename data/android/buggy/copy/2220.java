private void readObject(java.io.ObjectInputStream s) throws java.io.IOException, java.lang.ClassNotFoundException {
    s.defaultReadObject();
    image = javafx.embed.swing.SwingFXUtils.toFXImage(javax.imageio.ImageIO.read(s), null);
}