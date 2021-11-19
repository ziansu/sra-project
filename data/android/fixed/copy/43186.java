public void setCropMass(int cropMassStep) {
    if (((this.cropMass) + cropMassStep) >= 0) {
        this.cropMass += cropMassStep;
    }else
        java.lang.System.out.println("invalid crop Mass Step");
    
}