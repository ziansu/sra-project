public void setCamera(com.immatricious.fragmenter.renderer.camera.Camera camera) {
    if (!(cameras.contains(camera)))
        this.cameras.add(camera);
    
    this.mainCameraIndex = this.cameras.indexOf(camera);
    camera.trigger();
}