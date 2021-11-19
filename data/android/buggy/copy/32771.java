public void setCreation(com.creatubbles.api.core.Creation image) {
    creation = image;
    if (worldObj.isRemote) {
        createImage();
    }
}