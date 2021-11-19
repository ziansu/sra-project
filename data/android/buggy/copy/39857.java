public void changeSelectedImageLayerUpOrDown(int directionID) throws java.lang.Exception {
    setSelectedImageLayerAndImage(this.taskManager.getSelectedImageLayerAtUpOrDown(directionID), ID.IMAGELAYER_CHANGE_IMAGELAYER);
}