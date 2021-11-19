public org.apache.commons.math3.geometry.euclidean.threed.Vector3D getRayFromGivenPixelInWorldCoordinate(int x, int y) {
    org.apache.commons.math3.geometry.euclidean.threed.Vector3D intersectionInCameraCoordinate = this.getRayFromGivenPixelInCameraCoordinate(x, y);
    return VideoPopup.Camera.computeTransformedVectorGiven(this.homoTRInverse, intersectionInCameraCoordinate);
}