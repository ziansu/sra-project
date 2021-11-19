public void actionPerformed(java.awt.event.ActionEvent e) {
    currentSeene.setCaption(tfCaption.getText());
    org.seeneclub.toolkit.SeeneToolkit.doUploadSeene(storage.getUploadsDir(), currentSeene);
    uploadDialog.remove(gridPanel);
    uploadDialog.dispose();
}