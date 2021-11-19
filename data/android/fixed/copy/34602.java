public void setCurrentTransferred(java.lang.Integer currentTransferred) {
    if (currentTransferred < (totalTransferred)) {
        totalTransferred = 0;
    }
    this.currentTransferred = currentTransferred - (totalTransferred);
}