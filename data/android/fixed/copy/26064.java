public void checkNoImages(utils.Vector3f carrierPos) {
    if ((imgCounter) < (inputData.noImages.getValue())) {
        java.lang.System.out.println("taken");
        takePicture();
    }else {
        moving = false;
        imgCounter = 0;
    }
}