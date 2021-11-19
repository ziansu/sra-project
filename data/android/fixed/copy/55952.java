public void setIsPrimary(boolean isPrimary) {
    if (isPrimary) {
        this.isPrimary = true;
        this.isSecondary = false;
    }else {
        this.isPrimary = false;
    }
}