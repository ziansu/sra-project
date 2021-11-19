public void setStartMenuMode() {
    tankRevolution.services.AssetsManager.getInstance().loadStartMenuAssets();
    view.dispose();
    view = new tankRevolution.StartMenuView();
    mainController.setStartMenuMode(this);
}