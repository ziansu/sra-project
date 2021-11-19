public void actionPerformed(java.awt.event.ActionEvent arg0) {
    dispose();
    new fg.madLibs.DisplayFrame(textFile, words, image, title).setVisible(true);
}