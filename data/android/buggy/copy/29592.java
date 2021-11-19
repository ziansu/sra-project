private void cleanAddStage() {
    profileTextF.setEffect(null);
    portableCheck.setSelected(false);
    portableCombo.setDisable(true);
    destDirLabel.setText(com.github.palmeidaprog.nomad.main.StringResources.getDestDirLabel());
    foldersList.clear();
}