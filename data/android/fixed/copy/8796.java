@java.lang.Override
public void run() {
    allAnnotationsMapView.addAnnotations(this.photos);
    updateVisibleAnnotations();
    loadingStatus.removeFromSuperviewWithFade();
}