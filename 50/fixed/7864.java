public javax.swing.ImageIcon getScaledImage(java.awt.image.BufferedImage bufferedImage) {
    return new javax.swing.ImageIcon(bufferedImage.getScaledInstance(imageDimension.width, imageDimension.height, java.awt.Image.SCALE_SMOOTH));
}