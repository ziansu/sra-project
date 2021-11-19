public void setLensDistortion(boofcv.struct.distort.PixelTransform_F32 distToUndist) {
    this.ellipseDetector.setLensDistortion(distToUndist);
    if ((this.ellipseRefiner) != null)
        this.ellipseRefiner.setTransform(distToUndist);
    
    this.intensityCheck.setTransform(distToUndist);
}