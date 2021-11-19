public void flipCameraType() {
    if ((this.currentCamera) instanceof javafx.scene.PerspectiveCamera) {
        this.currentCamera = this.parallelCamera;
    }else {
        this.currentCamera = this.perspectiveCamera;
    }
    initialiseCamera();
}