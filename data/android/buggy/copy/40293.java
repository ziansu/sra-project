public void setFaceAngle(double faceAngle) {
    if (faceAngle < 0)
        faceAngle += 360;
    else
        if (faceAngle > 360)
            faceAngle -= 360;
        
    
    this.faceAngle = faceAngle;
}