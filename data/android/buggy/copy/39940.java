public boolean isVisible() {
    java.lang.System.out.println(this.getRelativeAngle());
    if ((this.getRelativeAngle()) > (c.getFOV()))
        return false;
    
    return true;
}